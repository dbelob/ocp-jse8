package acme.study_guide.chapter09.review_questions.question04;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
        System.out.println(path.subpath(1, 3).getName(1).toAbsolutePath());
    }
}
