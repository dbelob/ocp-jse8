package acme.tests.chapter19.test21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Roster {
    protected void printRoster(Path p) throws IOException {
//        for(Path f : Files.list(p)) { // n1
        for(Path f : Files.list(p)
                        .collect(Collectors.toList())) { // n1
            if(f.toString().endsWith(".per")) // n2
                System.out.print(f);
        }
    }
    public static void main(String... volunteers) throws IOException {
        new Roster().printRoster(Paths.get(volunteers[0]));
    }
}
