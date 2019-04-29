package acme.tests.chapter18.test25;

import java.io.File;
import java.util.stream.Stream;

public class Example {
    public void deleteTree(File f) {
        if (!f.isDirectory())
            f.delete();
        else {
//            Stream.of(f.list())
            Stream.of(f.listFiles())
                    .forEach(s -> deleteTree(s));
//            f.deleteDirectory();
            f.delete();
        }
    }
}
