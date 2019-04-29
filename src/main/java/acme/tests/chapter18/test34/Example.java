package acme.tests.chapter18.test34;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public String getNameQuick() throws IOException {
        final BufferedReader r = new BufferedReader(
                new FileReader("saved.name"));
        final String name = r.readLine();
//        r.flush();
        return name;
    }
    public String getNameSafely() throws IOException {
        try(final BufferedReader r = new BufferedReader(
                new FileReader("saved.name"))) {
            final String name = r.readLine();
//            r.flush();
            return name;
        }
    }
}
