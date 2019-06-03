package acme.enthuware.standard_tests.test2.test28;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

public class Example {
    public static void main(String[] args) {
        List<Double> dList = Arrays.asList(10.0, 12.0);
        DoubleFunction df = x -> x + 10;
        Consumer<Double> dc = x -> {double y = x + 10;};
        dList.stream().forEach(dc);
        dList.stream().forEach(d -> System.out.println(d));
    }
}
