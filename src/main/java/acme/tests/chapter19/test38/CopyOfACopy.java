package acme.tests.chapter19.test38;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import static java.nio.file.Files.copy;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyOfACopy {
    public void main(String[] items) throws Exception {
        final Path s = new File("apples.zip").toPath();
        final Path t = FileSystems.getDefault().getPath("oranges.zip");
        copy(s, t, REPLACE_EXISTING); // q1
//        copy(Files.newBufferedReader(t),t,ATOMIC_MOVE); // q2
    }
}
