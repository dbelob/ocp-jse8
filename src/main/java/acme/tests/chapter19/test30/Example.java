package acme.tests.chapter19.test30;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        Path w1 = Paths.get("../jungle/.././rain..")
                .toAbsolutePath().normalize();
        System.out.println(w1);
        System.out.println(w1.resolve("snow.txt"));
    }
}
