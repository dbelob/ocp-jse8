package acme.enthuware.standard_tests.test1.test39;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        Path p1 = Paths.get("c:\\..\\temp\\test.txt");
        System.out.println(p1.normalize().toUri());
    }
}
