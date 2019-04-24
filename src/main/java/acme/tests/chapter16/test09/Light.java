package acme.tests.chapter16.test09;

import java.io.IOException;

public class Light {
    public void turnOn() throws IOException {
        new IOException("Not ready");
    }
    public static void main(String[] b) throws Exception {
        try {
            new Light().turnOn();
        } catch (RuntimeException b1) { // y1
            System.out.println(b1);
            throw new IOException(); // y2
        } finally {
            System.out.println("complete");
        }
    }
}
