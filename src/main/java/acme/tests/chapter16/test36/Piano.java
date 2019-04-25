package acme.tests.chapter16.test36;

import java.io.FileNotFoundException;

class OutOfTuneException extends Exception {
    OutOfTuneException(String message) { super(message); }
}
public class Piano {
    public void play() throws OutOfTuneException, FileNotFoundException {
        throw new OutOfTuneException("Sour note!");
    }
    public static void main(String... keys) throws /* OutOfTuneException */ Exception {
        final Piano piano = new Piano();
        try {
            piano.play();
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("Song finished!");
        }
    }
}
