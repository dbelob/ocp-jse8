package acme.enthuware.standard_tests.test5.test43;

public class StaticTest1 {
    static {
        System.out.println("In static 1");
    }

    {
        System.out.println("In non - static 1");
    }
}
