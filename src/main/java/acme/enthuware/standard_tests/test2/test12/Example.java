package acme.enthuware.standard_tests.test2.test12;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        // c:\temp\test.txt\report.pdf
        Path p1 = Paths.get("c:\\temp\\test.txt");
        Path p2 = Paths.get("report.pdf");
        System.out.println(p1.resolve(p2));

        // temp\test.txt\report.pdf
        Path p3 = Paths.get("temp\\test.txt");
        Path p4 = Paths.get("report.pdf");
        System.out.println(p3.resolve(p4));

        // c:\temp\test.txt (absolute)
        Path p5 = Paths.get("report.pdf");
        Path p6 = Paths.get("c:\\temp\\test.txt");
        System.out.println(p5.resolve(p6));

        // report.pdf
        Path p7 = Paths.get("report.pdf");
        Path p8 = Paths.get("");
        System.out.println(p7.resolve(p8));
    }
}
