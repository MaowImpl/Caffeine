package maow.caffeine.parsing.util;

import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import maow.caffeine.parsing.model.Field;

import javax.lang.model.element.Modifier;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class PoetUtils {
    private static final Map<String, TypeName> typeCache = new HashMap<>();

    public static Modifier[] convertModifiers(String[] modifiers) {
        return Arrays.stream(modifiers)
                .map(String::toUpperCase)
                .map(Modifier::valueOf)
                .toArray(Modifier[]::new);
    }

    public static MethodSpec getConstructor(List<Field> fields) {
        final MethodSpec.Builder ctor = MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC);
        for (Field field : fields) {
            if (field.isFinal()) {
                final TypeName type = getType(field.getType());
                final String name = field.getName();
                if (type != null) {
                    ctor
                            .addParameter(type, name, Modifier.FINAL)
                            .addStatement("this.$L = $L", name, name);
                }
            }
        }
        return ctor.build();
    }

    public static MethodSpec getGetterMethod(TypeName type, String name) {
        return MethodSpec
                .methodBuilder(getMethodName("get", name))
                .addModifiers(Modifier.PUBLIC)
                .returns(type)
                .addStatement("return $L", name)
                .build();
    }

    public static MethodSpec getSetterMethod(TypeName type, String name) {
        return MethodSpec
                .methodBuilder(getMethodName("set", name))
                .addModifiers(Modifier.PUBLIC)
                .returns(TypeName.VOID)
                .addParameter(type, name, Modifier.FINAL)
                .addStatement("this.$L = $L", name, name)
                .build();
    }

    public static String getMethodName(String prefix, String name) {
        final char first = Character.toUpperCase(name.charAt(0));
        return prefix + first + name.substring(1);
    }

    // Hacky method to bypass JavaPoet restrictions.
    private static TypeName typeFrom(String name) {
        try {
            final Class<TypeName> clazz = TypeName.class;
            final Constructor<TypeName> constructor = clazz.getDeclaredConstructor(String.class);
            constructor.setAccessible(true);
            return constructor.newInstance(name);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static TypeName getType(String name) {
        return typeCache.computeIfAbsent(name, PoetUtils::typeFrom);
    }
}
