package acme.tests.chapter19.test18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class Example {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("/data/movie.txt");
        BasicFileAttributes b = Files.readAttributes(file, BasicFileAttributes.class);
        b = Files.readAttributes(file, DosFileAttributes.class);
        b = Files.readAttributes(file, PosixFileAttributes.class);
    }
}
