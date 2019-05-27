package acme.tests.chapter23.test10;

public class InitOrder {
    { System.out.print("1"); }
    static { System.out.print("2"); }

    public InitOrder() {
        System.out.print("3");
    }
    public static void callMe() {
        System.out.print("4");
    }
    public static void main(String[] args) {
        callMe();
        callMe();
        System.out.print("5");
    }
}
