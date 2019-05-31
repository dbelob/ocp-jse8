package acme.enthuware.standard_tests.test1.test48;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;

public class IOTest {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new FileReader("c:\\works\\a.java"))) {
            String line = null;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        } catch (/* NoSuchFileException | */ IOException /* | AccessDeniedException */ e) {
            e.printStackTrace();
        }
    }
}
