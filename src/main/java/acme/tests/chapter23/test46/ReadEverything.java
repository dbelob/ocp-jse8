package acme.tests.chapter23.test46;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadEverything {
    public void readFile(Path p) {
        try {
            Files.readAllLines(p)
//                    .parallel()
                    .forEach(System.out::println);
        } catch (Exception e) {
        }
    }

    public void read(Path directory) throws Exception {
        Files.walk(directory)
//                .filter(p -> File.isRegularFile(p))
                .filter(p -> Files.isRegularFile(p))
                .forEach(x -> readFile(x));
    }

    public static void main(String... books) throws Exception {
//        Path p = Path.get("collection");
        Path p = Paths.get("collection");
        new ReadEverything().read(p);
    }
}
