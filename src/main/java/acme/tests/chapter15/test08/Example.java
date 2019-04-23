package acme.tests.chapter15.test08;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Example {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(6, 10);
        LongStream longs = stream.mapToLong(i -> i);
//        System.out.println(longs.average().get());
        System.out.println(longs.average().getAsDouble());
    }
}
