package acme.study_guide.chapter09.review_questions.question20;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        final Path path = Paths.get(".").normalize(); // h1
        int count = 0;
        for (int i = 0; i < path.getNameCount(); ++i) {
            count++;
        }
        System.out.println(count);
    }
}
