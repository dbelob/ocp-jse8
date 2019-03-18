package acme.study_guide.chapter08.review_questions.question11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Example {
    public static void main(String[] args) throws IOException {
        File file1 = new File("filename1");
        File file2 = new File("filename2");

        file1.mkdirs();
        file1.renameTo(file2);
        Files.copy(file1.toPath(), file2.toPath());
        file1.mkdir();
    }
}
