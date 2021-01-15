package maow.caffeine.api;

import maow.caffeine.parsing.JavaLexer;
import maow.caffeine.parsing.JavaParser;
import maow.caffeine.parsing.listener.DataListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Path;

public class Caffeine {
    public static void process(Path input) throws IOException {
        final CharStream stream = CharStreams.fromPath(input);
        final JavaLexer lexer = new JavaLexer(stream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final JavaParser parser = new JavaParser(tokens);

        final ParseTree tree = parser.compilationUnit();
        final ParseTreeWalker walker = new ParseTreeWalker();
        final DataListener listener = new DataListener();

        walker.walk(listener, tree);
    }
}
