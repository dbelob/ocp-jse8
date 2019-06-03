package acme.enthuware.standard_tests.test2.test09;

public class Assertion {
    public void assert1(int k) {
        System.out.println("k is " + k);
    }

    public static void main(String[] args) {
        Assertion a = new Assertion();
        a.assert1(Integer.parseInt(args[0])); //4
    }
}
