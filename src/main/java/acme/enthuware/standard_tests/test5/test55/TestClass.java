package acme.enthuware.standard_tests.test5.test55;

class A extends Thread {
    static protected int i = 0;

    public void run() {
        for (; i < 5; i++) System.out.println("Hello");
    }
}

public class TestClass extends A {
    public void run() {
        for (; i < 5; i++) System.out.println("World");
    }

    public static void main(String args[]) {
        Thread t1 = new A();
        Thread t2 = new TestClass();
        t2.start();
        t1.start();
    }
}
