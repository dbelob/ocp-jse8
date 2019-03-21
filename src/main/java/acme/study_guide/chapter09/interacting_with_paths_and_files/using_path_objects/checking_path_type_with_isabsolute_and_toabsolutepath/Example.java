package acme.study_guide.chapter09.interacting_with_paths_and_files.using_path_objects.checking_path_type_with_isabsolute_and_toabsolutepath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:\\birds\\egret.txt");
        System.out.println("Path1 is Absolute? " + path1.isAbsolute());
        System.out.println("Absolute Path1: " + path1.toAbsolutePath());

        Path path2 = Paths.get("birds/condor.txt");
        System.out.println("Path2 is Absolute? " + path2.isAbsolute());
        System.out.println("Absolute Path2 " + path2.toAbsolutePath());
    }
}
