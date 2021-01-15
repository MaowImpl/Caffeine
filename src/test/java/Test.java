import maow.caffeine.api.Caffeine;

import java.io.IOException;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException {
        Caffeine.process(Paths.get("CaffeineTest.caffeine"));
    }
}
