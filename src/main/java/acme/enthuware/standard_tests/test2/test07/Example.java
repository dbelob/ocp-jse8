package acme.enthuware.standard_tests.test2.test07;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        // ../../index.html
        Path p4 = Paths.get("photos/goa");
        Path p5 = Paths.get("index.html");
        Path p6 = p4.relativize(p5);
        System.out.println(p6);

        // ../../index.html
        Path p7 = Paths.get("/photos/goa");
        Path p8 = Paths.get("/index.html");
        Path p9 = p7.relativize(p8);
        System.out.println(p9);

        // Exception
        Path p1 = Paths.get("photos/goa");
        Path p2 = Paths.get("/index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);
    }
}
