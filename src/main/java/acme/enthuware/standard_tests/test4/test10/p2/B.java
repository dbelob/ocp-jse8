package acme.enthuware.standard_tests.test4.test10.p2;

import acme.enthuware.standard_tests.test4.test10.p1.A;

public class B extends acme.enthuware.standard_tests.test4.test10.p1.A {
    public void process(A a) {
//        a.i = a.i * 2;
    }

    public void process(B b) {
        b.i = b.i * 2;
    }

    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        b.process(a);
        System.out.println(a.getI());
    }
}
