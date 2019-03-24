package acme.study_guide.chapter09.presenting_the_new_stream_methods.walking_a_directory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        Path path = Paths.get("/bigcats");
        try {
            Files.walk(path)
                    .filter(p -> p.toString().endsWith(".java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            // Handle file I/O exception...
            e.printStackTrace();
        }
    }
}
