package acme.study_guide.chapter09.introducing_nio_2.creating_paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        Path path1 = Paths.get("pandas/cuddly.png");
        Path path2 = Paths.get("c:\\zooinfo\\November\\employees.txt");
        Path path3 = Paths.get("/home/zoodirector");
    }
}
