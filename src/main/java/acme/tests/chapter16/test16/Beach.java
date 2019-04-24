package acme.tests.chapter16.test16;

import java.io.IOException;

public class Beach {
    class TideException extends Exception {}
    public void surf() throws RuntimeException {
        try {
            throw new TideException();
        } catch (IllegalStateException | TideException t) {}
    }
}
