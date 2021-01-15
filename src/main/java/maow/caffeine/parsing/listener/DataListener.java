package maow.caffeine.parsing.listener;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import maow.caffeine.parsing.JavaParser;
import maow.caffeine.parsing.JavaParserBaseListener;
import maow.caffeine.parsing.model.Field;
import maow.caffeine.parsing.util.Modifiers;
import maow.caffeine.parsing.util.PoetUtils;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public final class DataListener extends JavaParserBaseListener {
    private String name;
    private String[] modifiers;
    private final List<Field> fields = new ArrayList<>();

    private boolean hasData = false;

    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        final JavaParser.TypeDeclarationContext typeCtx = (JavaParser.TypeDeclarationContext) ctx.getParent();
        final List<JavaParser.ClassOrInterfaceModifierContext> modifierCtxes = typeCtx.classOrInterfaceModifier();
        for (JavaParser.ClassOrInterfaceModifierContext modifierCtx : modifierCtxes) {
            hasData = (modifierCtx.DATA() != null);
            if (hasData) {
                this.name = ctx.IDENTIFIER().getText();
                this.modifiers = new Modifiers(modifierCtxes).build("data");
                break;
            }
        }
        super.enterClassDeclaration(ctx);
    }

    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        if (hasData) {
            final TypeSpec.Builder classSpec = TypeSpec
                    .classBuilder(name)
                    .addModifiers(
                            PoetUtils.convertModifiers(modifiers)
                    );
            classSpec.addMethod(PoetUtils.getConstructor(fields));
            for (Field field : fields) {
                final TypeName type = PoetUtils.getType(field.getType());
                final String name = field.getName();
                final Modifier[] modifiers = PoetUtils.convertModifiers(field.getModifiers());
                if (type != null) {
                    classSpec
                            .addField(type, name, modifiers)
                            .addMethod(PoetUtils.getGetterMethod(type, name));
                    if (!field.isFinal()) classSpec.addMethod(PoetUtils.getSetterMethod(type, name));
                }
            }
            try {
                JavaFile.builder("", classSpec.build())
                        .build()
                        .writeTo(Paths.get(""));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        super.exitClassDeclaration(ctx);
    }

    @Override
    public void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        if (hasData) {
            final String[] modifiers = getFieldModifiers(ctx);
            final String type = getFieldType(ctx);
            for (JavaParser.VariableDeclaratorContext varCtx : ctx.variableDeclarators().variableDeclarator()) {
                final String name = varCtx.variableDeclaratorId().IDENTIFIER().getText();
                fields.add(new Field(modifiers, type, name));
            }
        }
        super.enterFieldDeclaration(ctx);
    }

    private String getFieldType(JavaParser.FieldDeclarationContext ctx) {
        final JavaParser.TypeTypeContext typeType = ctx.typeType();
        return (typeType.classOrInterfaceType() == null)
                ? typeType.primitiveType().getText()
                : typeType.classOrInterfaceType().getText();
    }

    private String[] getFieldModifiers(JavaParser.FieldDeclarationContext ctx) {
        final JavaParser.ClassBodyDeclarationContext classVarCtx = (JavaParser.ClassBodyDeclarationContext) ctx.getParent().getParent();
        final int modifierTotal = classVarCtx.modifier().size();
        final String[] modifiers = new String[modifierTotal];
        for (int i = 0; i < modifierTotal; i++) {
            final JavaParser.ModifierContext modifierCtx = classVarCtx.modifier(i);
            modifiers[i] = modifierCtx.getText();
        }
        return modifiers;
    }
}