package acme.tests.chapter16.test33;

public class Example {
    public static void main(String[] args) {
        int age = 22;
        final String name = "Josephine";

//        assert (age=2);
        assert age!=age : (1<age ? "Error" : 10);
//        assert name.equals("") : () -> "Oops";
//        assert name.length()<(long)age : return "Mistake";
    }
}
