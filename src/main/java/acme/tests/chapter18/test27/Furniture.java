package acme.tests.chapter18.test27;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Furniture {
    public final static void main(String... inventory) throws Exception {
        Writer w = new FileWriter("couch.txt");
        try (BufferedWriter bw = new BufferedWriter(w)) {
            bw.write("Blue coach on Sale!");
        } finally {
            w.flush();
            w.close();
        }
        System.out.print("Done!");
    }
}
