package acme.tests.chapter14.test10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Market {
    private static void checkPrices(List<Double> prices,
                                    /* DoubleConsumer */ Consumer<Double> scanner) {
        prices.forEach(scanner);
    }
    public static void main(String[] right) {
        List<Double> prices = Arrays.asList(1.2, 6.5, 3.0);
        checkPrices(prices,
                p -> {
                    String result = p<5 ? "Correct" : "Too high";
                    System.out.println(result);
                });
    }
}
