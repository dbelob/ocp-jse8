package acme.enthuware.standard_tests.test1.test82;

public class Nesting {
    public static void main(String args[]) {
        B.C obj = new B().new C();
    }
}

class A {
    char c;

    A(char c) {
        this.c = c;
    }
}

class B extends A {
    char c = 'a';

    B() {
        super('b');
    }

    class C extends A {
        char c = 'c';

        C() {
            super('d');
            System.out.println(B.this.c);
            System.out.println(C.this.c);
            System.out.println(super.c);
        }
    }
}
