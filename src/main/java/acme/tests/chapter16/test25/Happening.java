package acme.tests.chapter16.test25;

class FunEvent implements AutoCloseable {
    public void close() {
        System.out.print("1");
    }
}
public class Happening {
    public static void main(String... lots) {
        try (FunEvent f = new FunEvent()) {
            System.out.print("2");
            throw new ArithmeticException();
        } catch (Exception e) {
            System.out.print("3");
        } finally {
            System.out.print("4");
        }
    }
}
