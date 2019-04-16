package acme.tests.chapter11.test37;

public class HowMany {
    static {
        System.out.println("any");
    }
    {
        System.out.println("more");
    }
    public static void main(String[] args) {
        new HowMany();
        new HowMany();
    }
}
