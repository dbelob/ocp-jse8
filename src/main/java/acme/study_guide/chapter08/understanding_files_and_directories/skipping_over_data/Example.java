package acme.study_guide.chapter08.understanding_files_and_directories.skipping_over_data;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("filename.ext");
        System.out.print((char) is.read());
        is.skip(2);
        is.read();
        System.out.print((char) is.read());
        System.out.print((char) is.read());
    }
}
