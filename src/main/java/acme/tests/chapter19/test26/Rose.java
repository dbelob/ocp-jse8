package acme.tests.chapter19.test26;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Rose {
    public void tendGarden(Path p) throws Exception {
//        Files.walk(p,1)
//                .map(p -> p.toRealPath())
//                .forEach(System.out::println);
    }
    public static void main(String... thorns) throws Exception {
        new Rose().tendGarden(Paths.get(thorns[0]));
    }
}
