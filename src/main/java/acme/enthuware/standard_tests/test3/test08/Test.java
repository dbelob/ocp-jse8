package acme.enthuware.standard_tests.test3.test08;

import java.io.FileWriter;

public class Test {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("text.txt");
        // fw.write("hello"); //1
        fw.close();
    }
}
