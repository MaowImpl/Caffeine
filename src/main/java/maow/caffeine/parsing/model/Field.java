package maow.caffeine.parsing.model;

import java.util.Arrays;

public final class Field {
    private final String[] modifiers;
    private final String type;
    private final String name;
    private final boolean isFinal;

    public Field(String[] modifiers, String type, String name) {
        this.modifiers = modifiers;
        this.type = type;
        this.name = name;
        this.isFinal = Arrays.asList(modifiers).contains("final");
    }

    public String[] getModifiers() {
        return modifiers;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public boolean isFinal() {
        return isFinal;
    }
}
