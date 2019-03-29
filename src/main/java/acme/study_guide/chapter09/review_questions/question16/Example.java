package acme.study_guide.chapter09.review_questions.question16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/squid/food-schedule.csv");
        Files.lines(path) // r1
                .flatMap(p -> Stream.of(p.split(","))) // r2
                .map(s -> s.toUpperCase()) // r3
                .forEach(System.out::println);
    }
}
