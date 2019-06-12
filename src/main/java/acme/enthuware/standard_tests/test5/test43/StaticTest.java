package acme.enthuware.standard_tests.test5.test43;

public class StaticTest {
    static {
        System.out.println("In static");
    }

    {
        System.out.println("In non - static");
    }

    public static void main(String args[]) {
        StaticTest1 st1;                    //1
        System.out.println(" 1 ");
        st1 = new StaticTest1();            //2
        System.out.println(" 2 ");
        StaticTest1 st2 = new StaticTest1(); //3
    }
}
