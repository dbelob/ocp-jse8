package acme.tests.chapter23.test56;

import java.util.function.Supplier;

public class Ready {
    private static double getNumber() {
        return .007;
    }
    public static void math() {
//        Supplier<double> s = Ready:getNumber;
        Supplier<Double> s = Ready::getNumber;
        double d = s.get();
        System.out.println(d);
    }
}
