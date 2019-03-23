package acme.study_guide.chapter09.understanding_file_attributes.discovering_basic_file_attributes.reading_common_attributes_with_isdirectory_isregularfile_and_issymboliclink;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        Files.isDirectory(Paths.get("/canine/coyote/fur.jpg"));
        Files.isRegularFile(Paths.get("/canine/types.txt"));
        Files.isSymbolicLink(Paths.get("/canine/coyote"));
    }
}
