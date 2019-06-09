package acme.enthuware.standard_tests.test4.test04;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3);

        double sum1 = ls.stream().reduce(0, (a, b)->a+b);
        double sum2 = ls.stream().mapToInt(x->x).sum();

//        double sum = 0;
//        ls.stream().forEach(a -> {
//            sum = sum + a;
//        });
    }
}
