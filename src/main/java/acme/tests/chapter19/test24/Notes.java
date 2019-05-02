package acme.tests.chapter19.test24;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Notes {
    public void printNotes() {
        try (OutputStream out = System.out) { // y1
//            Files.copy(out, Paths.get("course.txt"));
            Files.copy(Paths.get("course.txt"), out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] coursework) {
        new Notes().printNotes();
    }
}
