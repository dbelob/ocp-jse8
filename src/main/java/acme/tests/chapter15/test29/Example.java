package acme.tests.chapter15.test29;

import java.util.stream.LongStream;

public class Example {
    public static void main(String[] args) {
        LongStream stream = LongStream.of(9);
        stream.mapToInt(p -> (int) p).forEach(System.out::print);
    }
}
