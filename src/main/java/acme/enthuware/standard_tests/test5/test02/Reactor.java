package acme.enthuware.standard_tests.test5.test02;

interface Boiler {
    public void boil();

    public static void shutdown() {
        System.out.println("shutting down");
    }
}

interface Vaporizer extends Boiler {  //1
    public default void vaporize() {
        boil();
        System.out.println("Vaporized!");
    }
}

public class Reactor implements Vaporizer {
    public void boil() {
        System.out.println("Boiling...");
    }

    public static void main(String[] args) {
        Vaporizer v = new Reactor(); //2
        v.vaporize(); //3
//        v.shutdown(); //4
        Boiler.shutdown(); //4
    }
}
