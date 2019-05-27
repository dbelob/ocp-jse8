package acme.tests.chapter23.test24;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class SearchEnvironment {
    public static void accessFile(Path p, long timeEpoch) {
        try {
//            Files.readAttributes(p, BasicFileAttributes.class)
//                    .setTimes(null, null, FileTime.fromMillis(timeEpoch));
            Files.getFileAttributeView(p, BasicFileAttributeView.class)
                    .setTimes(null, null, FileTime.fromMillis(timeEpoch));
        } catch (Throwable e) {
        } finally {}
    }
    public static final void main(String[] unused) throws Exception {
        Path w = Paths.get("/environment");
        Files.walk(w)
                .forEach(q -> accessFile(q,System.currentTimeMillis()));
    }
}
