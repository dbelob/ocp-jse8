package acme.study_guide.chapter09.interacting_with_paths_and_files.interacting_with_files.testing_uniqueness_with_issamefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        try {
            System.out.println(Files.isSameFile(Paths.get("/user/home/cobra"),
                    Paths.get("/user/home/snake")));
            System.out.println(Files.isSameFile(Paths.get("/user/tree/../monkey"),
                    Paths.get("/user/monkey")));
            System.out.println(Files.isSameFile(Paths.get("/leaves/./giraffe.exe"),
                    Paths.get("/leaves/giraffe.exe")));
            System.out.println(Files.isSameFile(Paths.get("/flamingo/tail.data"),
                    Paths.get("/cardinal/tail.data")));
        } catch (IOException e) {
            // Handle file I/O exception...
            e.printStackTrace();
        }
    }
}
