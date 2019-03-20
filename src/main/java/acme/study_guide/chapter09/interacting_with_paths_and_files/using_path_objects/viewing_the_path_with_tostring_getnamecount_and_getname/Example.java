package acme.study_guide.chapter09.interacting_with_paths_and_files.using_path_objects.viewing_the_path_with_tostring_getnamecount_and_getname;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The Path Name is: " + path);

        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println(" Element " + i + " is: " + path.getName(i));
        }
    }
}
