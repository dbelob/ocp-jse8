package acme.enthuware.standard_tests.test3.test80;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void writeData() throws Exception {
        Path p1 = Paths.get("c:\\temp\\test1.txt");
        Path p2 = p1.resolveSibling("text2.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(p2.toFile()));
        bw.write("hello");
        bw.close();
    }
}
