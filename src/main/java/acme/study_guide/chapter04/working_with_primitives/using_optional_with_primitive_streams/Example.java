package acme.study_guide.chapter04.working_with_primitives.using_optional_with_primitive_streams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 10);
        OptionalDouble optional = stream.average();

        optional.ifPresent(System.out::println);
        System.out.println(optional.getAsDouble());
        System.out.println(optional.orElseGet(() -> Double.NaN));
    }
}
