package acme.study_guide.chapter04.using_streams.printing_a_stream;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
//        Stream<String> infinite1 = Stream.generate(() -> "chimp");
//        infinite1.forEach(System.out::println);

//        Stream<String> infinite2 = Stream.generate(() -> "chimp");
//        System.out.println(infinite2.collect(Collectors.toList()));

//        Stream<String> infinite3 = Stream.generate(() -> "chimp");
//        infinite3.peek(System.out::println).count();

        Stream<String> infinite4 = Stream.generate(() -> "chimp");
        infinite4.limit(5).forEach(System.out::println);
    }
}
