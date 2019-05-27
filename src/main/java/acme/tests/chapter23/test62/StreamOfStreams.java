package acme.tests.chapter23.test62;

import java.util.stream.Stream;

public class StreamOfStreams {
    public static void main(String[] args) {
        Integer result =
                Stream.of(getNums(9, 8), getNums(22, 33)) // c1
//                        .filter(x -> !x.isEmpty()) // c2
                        .flatMap(x -> x) // c3
                        .max((a, b) -> a - b) // c4
                        .get();
        System.out.println(result);
    }
    private static Stream<Integer> getNums(int num1, int num2) {
        return Stream.of(num1, num2);
    }
}
