package acme.study_guide.assessment.test07;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("/bats/night","../").resolve(Paths.get(
                "./sleep.txt")).normalize();
        Path path2 = new File("../sleep.txt").toPath().toRealPath();

        System.out.print(Files.isSameFile(path1,path2));
        System.out.print(" "+path1.equals(path2));
    }
}
