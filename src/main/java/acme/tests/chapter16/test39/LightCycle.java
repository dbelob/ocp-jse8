package acme.tests.chapter16.test39;

class DiskPlayer implements AutoCloseable {
    public void close() /* throws Exception */ {}
}
public class LightCycle {
    public static void main(String... bits) {
        try (DiskPlayer john = new DiskPlayer()) {
            System.out.println("ping");
        } finally {
            System.out.println("pong");
        }
        System.out.println("return");
    }
}
