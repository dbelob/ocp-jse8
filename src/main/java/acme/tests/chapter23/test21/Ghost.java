package acme.tests.chapter23.test21;

import java.util.function.*;
abstract class Phantom {
    public void bustLater(DoubleConsumer buster, double value) {
        buster.accept(value);
    }
}
public class Ghost extends Phantom {
    public void bustNow(Consumer<Double> buster, double value) {
        buster.accept(value);
    }
    void call() {
        double value = 10;

        // A
        bustNow(System.out::print,value);
        bustLater(System.out::print,value);

        // C
        bustNow(g -> {System.out.println();},value);
        bustLater(g -> {System.out.println();},value);

        // D
//        bustNow(u -> System.out.println((long)u),value);
        bustLater(u -> System.out.println((long)u),value);

        // E
        bustNow(v -> System.out.print(v),value);
        bustLater(v -> System.out.print(v),value);

        // F
//        bustNow(w -> System.out::println,value);
//        bustLater(w -> System.out::println,value);

        double double1 = 123;
        Double double2 = 123d;
        long long1 = (long) double1;
//        long long2 = (long) double2;
    }
}
