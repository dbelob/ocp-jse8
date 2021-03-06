package acme.tests.chapter23.test50;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) throws IOException {
        Path t1 = Paths.get("/sky/.././stars.exe");
        Path t2 = Paths.get("/stars.exe");
        Path t3 = t1.resolve(t2);

        boolean b1 = t1.equals(t2);
        boolean b2 = t1.normalize().equals(t2);
        boolean b3 = Files.isSameFile(t1.normalize(),t2);
        boolean b4 = Files.isSameFile(t2,t3);

        System.out.print(b1+","+b2+","+b3+","+b4);
    }
}
