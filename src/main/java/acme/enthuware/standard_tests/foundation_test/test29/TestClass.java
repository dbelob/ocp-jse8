package acme.enthuware.standard_tests.foundation_test.test29;

public class TestClass
{
    static int si = 10;   int ii = 20;
    public static void inner()
    {
        int ai = 30; //automatic variable
        ai = 31; //ai is not effectively final anymore.
        final int fai = 40; //automatic final variable
        class Inner
        {
            public Inner()  {   System.out.println(si+"    "+fai);      }
        }
        new Inner();
    }
    public static void main(String[] args)   {     TestClass.inner();       }
}
