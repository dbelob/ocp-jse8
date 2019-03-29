package acme.study_guide.chapter09.review_questions.question03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class Example {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("sloth.schedule");
//        BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
        BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        BasicFileAttributes attributes = view.readAttributes();

        if (attributes.size() > 0 && attributes.creationTime().toMillis() > 0) {
//            attributes.setTimes(null, null, null);
            view.setTimes(null, null, null);
        }
    }
}
