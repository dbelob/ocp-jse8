package acme.enthuware.objective_wise_tests.chapter08_nio2.test05;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        Path p1 = Paths.get("c:\\personal\\.\\photos\\..\\readme.txt");
        Path p2 = Paths.get("c:\\personal\\index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);

        Path p4 = Paths.get("c:\\personal\\readme.txt");
        Path p5 = Paths.get("c:\\personal\\index.html");
        Path p6 = p4.relativize(p5);
        System.out.println(p6);

        System.out.println(p1.normalize());
    }
}
