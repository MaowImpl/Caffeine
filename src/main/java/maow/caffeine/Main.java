package maow.caffeine;

import maow.caffeine.api.Caffeine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            final Path input = Paths.get(args[0]);
            if (Files.exists(input)) {
                Caffeine.process(input);
                return;
            }
            System.err.println("Error: Input file does not exist.");
            return;
        }
        System.err.println("Error: Missing input path.");
    }
}
