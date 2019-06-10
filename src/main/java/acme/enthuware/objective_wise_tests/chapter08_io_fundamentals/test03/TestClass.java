package acme.enthuware.objective_wise_tests.chapter08_io_fundamentals.test03;

import java.io.*;

// What will the following program print when compiled and run?
class Boo implements Serializable {
    transient int ti = 10;
    static int si = 20;
}

public class TestClass {
    public static void main(String[] args) throws Exception {
        Boo boo = new Boo();
        boo.si++;
        System.out.println(boo.ti + " " + boo.si);
        FileOutputStream fos = new FileOutputStream("c:\\temp\\boo.ser");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(boo);
        os.close();

        FileInputStream fis = new FileInputStream("c:\\temp\\boo.ser");
        ObjectInputStream is = new ObjectInputStream(fis);
        boo = (Boo) is.readObject();
        is.close();
        System.out.println(boo.ti + " " + boo.si);
    }
}
// Yo had to select 1 option
//
// A
// It will not compile.
//
// B
// It will throw an exception at run time.
//
// C
// 10 21
// 10 21
//
// D
// 10 21
// 10 20
//
// E
// 10 21
// 0 20
//
// F
// 10 21
// 0 21
