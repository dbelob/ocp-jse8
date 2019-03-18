package acme.study_guide.chapter08.review_questions.question05;

import java.io.Console;
import java.io.IOException;
import java.io.Writer;

public class Example {
    public static void main(String[] args) throws IOException {
        String line;
        Console c = System.console();
        Writer w = c.writer();
        if ((line = c.readLine()) != null)
            w.append(line);
        w.flush();
    }
}
