package acme.tests.chapter19.test35;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Sun {
    public void printInfo() {
        Path halleysComet = Paths.get("stars/./rocks/../m1.meteor")
                .normalize();
        Path lexellsComet = Paths.get("./stars/../solar/");
        lexellsComet = lexellsComet.subpath(0, 2)
                .resolve("m1.meteor")
                .normalize();
        System.out.println("halleysComet: " + halleysComet);
        System.out.println("lexellsComet: " + lexellsComet);
        System.out.println(halleysComet.equals(lexellsComet)
                ? "Same!" : "Different!");
    }
    public static void main(String... emerald) {
        Sun s = new Sun();
        s.printInfo();
    }
}
