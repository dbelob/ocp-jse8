package acme.tests.chapter15.test31;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Stream<Character> stream = Stream.of('c', 'b', 'a');
        System.out.println(stream.sorted().findFirst());
    }
}
