package acme.study_guide.chapter09.interacting_with_paths_and_files.using_path_objects.deriving_a_path_with_relativize;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        Path path1 = Paths.get("fish.txt");
        Path path2 = Paths.get("birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));

        Path path3 = Paths.get("E:\\habitat");
        Path path4 = Paths.get("E:\\sanctuary\\raven");
        System.out.println(path3.relativize(path4));
        System.out.println(path4.relativize(path3));
    }
}
