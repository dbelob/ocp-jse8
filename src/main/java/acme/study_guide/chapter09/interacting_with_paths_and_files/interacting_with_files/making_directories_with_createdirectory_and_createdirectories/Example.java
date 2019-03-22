package acme.study_guide.chapter09.interacting_with_paths_and_files.interacting_with_files.making_directories_with_createdirectory_and_createdirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        try {
            Files.createDirectory(Paths.get("/bison/field"));
            Files.createDirectories(Paths.get("/bison/field/pasture/green"));
        } catch (IOException e) {
            // Handle file I/O exception...
            e.printStackTrace();
        }
    }
}
