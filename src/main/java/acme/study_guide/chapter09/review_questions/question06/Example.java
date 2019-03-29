package acme.study_guide.chapter09.review_questions.question06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
//        boolean myBoolean = Files.walk(path)
//                .filter((p, a) -> a.isDirectory() && !path.equals(p)) // w1
//                .findFirst().isPresent(); // w2
        boolean myBoolean = Files.find(path, 10,
                (p, a) -> a.isDirectory() && !path.equals(p))
                .findFirst().isPresent(); // w2
        System.out.println(myBoolean ? "No Sub-directory" : "Has Sub-directory");
    }
}
