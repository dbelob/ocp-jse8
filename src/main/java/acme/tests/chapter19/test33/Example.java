package acme.tests.chapter19.test33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) throws IOException {
//        Path v1 = Path.get("/./desert/./").resolve(Paths.get("sand.doc"));
        Path v1 = Paths.get("/./desert/./").resolve(Paths.get("sand.doc"));
        Path v2 = new File("/desert/./cactus/../sand.doc").toPath();
        System.out.print(Files.isSameFile(v1,v2));
        System.out.print(" "+v1.equals(v2));
        System.out.print(" "+v1.normalize().equals(v2.normalize()));
    }
}
