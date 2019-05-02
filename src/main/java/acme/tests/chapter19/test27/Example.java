package acme.tests.chapter19.test27;

import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        System.out.println("Paths.get(\"../sang\").getParent(): " + Paths.get("../sang").getParent());
        System.out.println("Paths.get(\"/sing\").getParent(): " + Paths.get("/sing").getParent());
        System.out.println("Paths.get(\"../sung\").getRoot(): " + Paths.get("../sung").getRoot());

        Paths.get("../sang").getParent().getParent();
        Paths.get("/sing").getParent().getRoot();
        Paths.get("/song").getRoot().getRoot();
        Paths.get("../sung").getRoot().getParent();
    }
}
