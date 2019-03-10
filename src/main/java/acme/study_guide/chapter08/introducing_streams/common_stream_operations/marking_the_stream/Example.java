package acme.study_guide.chapter08.introducing_streams.common_stream_operations.marking_the_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("filename.ext");
        System.out.print((char) is.read());
        if (is.markSupported()) {
            is.mark(100);
            System.out.print((char) is.read());
            System.out.print((char) is.read());
            is.reset();
        }
        System.out.print((char) is.read());
        System.out.print((char) is.read());
        System.out.print((char) is.read());
    }
}
