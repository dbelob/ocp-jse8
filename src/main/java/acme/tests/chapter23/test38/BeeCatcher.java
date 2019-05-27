package acme.tests.chapter23.test38;

import java.io.*;
class StungException extends Exception {}
class Suit implements Closeable {
    public void close() throws IOException {}
}
public class BeeCatcher {
    public static void main(String... bees) {
        try (Suit s = new Suit(); Suit t = new Suit()) {
            throw new StungException();
        } catch (StungException e) {
        } catch (Exception e) {
        } finally {
        }
    }
}
