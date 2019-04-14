package acme.study_guide.assessment.test17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/gorilla/signed-words.txt");

//        Files.find(path.getParent(), 10.0, // k1
//                (Path p) -> p.toString().endsWith(".txt") && Files.isDirectory(p)) // k2
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
        Files.find(path.getParent(), 10, // k1
                (Path p, BasicFileAttributes a) -> p.toString().endsWith(".txt") && Files.isDirectory(p)) // k2
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Files.readAllLines(path) // k3
                .stream()
                .flatMap(p -> Stream.of(p.split(" "))) // k4
                .map(s -> s.toLowerCase()) // k5
                .forEach(System.out::println);
    }
}
