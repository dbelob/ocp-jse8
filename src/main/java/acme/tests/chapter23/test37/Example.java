package acme.tests.chapter23.test37;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        Path x = Paths.get(".","song","..","/note");
        Path y = Paths.get("/dance/move.txt");
        x.normalize();
        System.out.println(x.resolve(y));
        System.out.println(y.relativize(x));
    }
}
