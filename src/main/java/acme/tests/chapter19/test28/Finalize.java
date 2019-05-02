package acme.tests.chapter19.test28;

import java.nio.file.Path;

public class Finalize {
    public Path makeAbsolute(Path p) {
        if (p != null && !p.isAbsolute())
            return p.toAbsolutePath();
        return p;
    }
}
