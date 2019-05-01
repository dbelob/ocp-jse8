package acme.tests.chapter19.test17;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Snow {
    public static boolean removeSnow(Path flake) throws IOException {
        if(!Files.isDirectory(flake) && !Files.isSymbolicLink(flake))
//            return Files.delete(flake);
            return Files.deleteIfExists(flake);
        else return true;
    }
    public static void main(String[] cones) throws IOException {
        File driveway = new File("/driveway");
        for(File f : driveway.listFiles()) {
            System.out.println(removeSnow(f.toPath()));
        }
    }
}
