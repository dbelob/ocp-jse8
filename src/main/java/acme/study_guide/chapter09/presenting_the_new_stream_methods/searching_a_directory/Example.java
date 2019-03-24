package acme.study_guide.chapter09.presenting_the_new_stream_methods.searching_a_directory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Path path = Paths.get("/bigcats");
        long dateFilter = 1420070400000l;
        try {
            Stream<Path> stream = Files.find(path, 10,
                    (p, a) -> p.toString().endsWith(".java")
                            && a.lastModifiedTime().toMillis() > dateFilter);
            stream.forEach(System.out::println);
        } catch (Exception e) {
            // Handle file I/O exception...
            e.printStackTrace();
        }
    }
}
