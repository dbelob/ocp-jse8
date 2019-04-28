package acme.tests.chapter18.test09;

import java.io.FileInputStream;
import java.io.InputStream;

public class PrimeReader {
    public static void main(String[] real) throws Exception {
        try (InputStream is = new FileInputStream("prime6.txt")) {
            is.skip(1);
            is.read();
            is.skip(1);
            is.read();
            is.mark(4);
            is.skip(1);
            is.reset();
            System.out.print(is.read());
        }
    }
}
