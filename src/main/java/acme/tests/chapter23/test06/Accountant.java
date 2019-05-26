package acme.tests.chapter23.test06;

public class Accountant {
    class AddingException extends Exception {};
    class DividingException extends Exception {};
    class UnexpectedException extends RuntimeException {};
    public void doTaxes() throws Throwable {
        try {
            throw new IllegalStateException();
//        } catch (AddingException | DividingException e) { // p1
//            System.out.println("Math Problem");
        } catch (/* UnexpectedException | */ Exception f) { // p2
            System.out.println("Unknown Error");
            throw f;
        }
    }
    public static void main(String[] numbers) throws Throwable {
        try {
            new Accountant().doTaxes();
        } finally {
            System.out.println("All done!");
        }
    }
}
