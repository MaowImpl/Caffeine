package maow.caffeine.parsing.util;

import maow.caffeine.parsing.JavaParser;
import org.antlr.v4.runtime.RuleContext;

import java.util.Arrays;
import java.util.List;

public final class Modifiers {
    private final List<JavaParser.ClassOrInterfaceModifierContext> modifierCtxes;

    public Modifiers(List<JavaParser.ClassOrInterfaceModifierContext> modifierCtxes) {
        this.modifierCtxes = modifierCtxes;
    }

    public String[] build(String... disallowed) {
        final List<String> disallowedList = Arrays.asList(disallowed);
        return modifierCtxes
                .stream()
                .map(RuleContext::getText)
                .filter(s -> !disallowedList.contains(s))
                .toArray(String[]::new);
    }
}
