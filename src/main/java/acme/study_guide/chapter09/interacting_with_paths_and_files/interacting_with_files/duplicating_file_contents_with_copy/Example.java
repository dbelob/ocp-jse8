package acme.study_guide.chapter09.interacting_with_paths_and_files.interacting_with_files.duplicating_file_contents_with_copy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("source-data.txt");
             OutputStream out = new FileOutputStream("output-data.txt")) {
            // Copy stream data to file
            Files.copy(is, Paths.get("c:\\mammals\\wolf.txt"));
            // Copy file data to stream
            Files.copy(Paths.get("c:\\fish\\clown.xsl"), out);
        } catch (IOException e) {
            // Handle file I/O exception...
            e.printStackTrace();
        }
    }
}
