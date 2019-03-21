package acme.study_guide.chapter09.interacting_with_paths_and_files.interacting_with_files.testing_a_path_with_exists;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        System.out.println(Files.exists(Paths.get("/ostrich/feathers.png")));
        System.out.println(Files.exists(Paths.get("/ostrich")));
    }
}
