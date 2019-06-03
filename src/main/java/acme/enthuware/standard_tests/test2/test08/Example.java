package acme.enthuware.standard_tests.test2.test08;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {
        IntStream is1 = IntStream.range(0, 5); //1
        OptionalDouble x = is1.average(); //2
        System.out.println(x); //3
    }
}
