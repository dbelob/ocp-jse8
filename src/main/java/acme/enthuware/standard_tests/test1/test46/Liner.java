package acme.enthuware.standard_tests.test1.test46;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Liner {
    public void dumper(File f) throws IOException {
        FileReader x1 = new FileReader(f);
        BufferedReader x2 = new BufferedReader(x1);
        String x3 = x2.readLine();
        while (x3 != null) {
            System.out.println(x3);
            x3 = x2.readLine();
        }
    }
}
