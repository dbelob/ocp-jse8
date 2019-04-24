package acme.tests.chapter16.test18;

import java.io.Closeable;
import java.io.IOException;

interface Closing {
    void close() throws Exception;
}
class Shelf implements /* Closing */ AutoCloseable {
    public void close() throws Exception {}
}
public class Step {
    static {
        try (Shelf shelf = new Shelf()) {
//            throws new IllegalArgumentException();
            throw new IllegalArgumentException();
        } catch (Exception e) {
//        } catch (IllegalArgumentException e) {
        } finally {
//            shelf.close();
        }
    }
}
