package acme.tests.chapter15.test32;

import java.util.Comparator;
import java.util.stream.Stream;

public class Compete {
    public static void main(String[] args) {
        Stream<Integer> is = Stream.of(8, 6, 9);
        Comparator<Integer> c = (a, b) -> a - b;
        is.sorted(c).forEach(System.out::print);
    }
}
