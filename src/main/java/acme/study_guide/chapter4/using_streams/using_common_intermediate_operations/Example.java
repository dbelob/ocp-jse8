package acme.study_guide.chapter4.using_streams.using_common_intermediate_operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        // filter()
        System.out.println("filter()");
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::print); // monkey

        // distinct()
        System.out.println("\n\ndistinct()");
        /* Stream<String> */ s = Stream.of("duck", "duck", "duck", "goose");
        s.distinct().forEach(System.out::print); // duckgoose

        // limit() and skip()
        System.out.println("\n\nlimit() and skip()");
        Stream<Integer> s1 = Stream.iterate(1, n -> n + 1);
        s1.skip(5).limit(2).forEach(System.out::print); // 67

        // map()
        System.out.println("\n\nmap()");
        Stream<String> s2 = Stream.of("monkey", "gorilla", "bonobo");
        s2.map(String::length).forEach(System.out::print); // 676

        // flatMap()
        System.out.println("\n\nflatMap()");
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(l -> l.stream()).forEach(System.out::println);

        // sorted()
        System.out.println("\nsorted()");
        /* Stream<String> */ s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::print); // bear-brown-

        System.out.println();

        /* Stream<String> */ s = Stream.of("brown bear-", "grizzly-");
        s.sorted(Comparator.reverseOrder())
                .forEach(System.out::print); // grizzly-brown bear-

        // peek()
        System.out.println("\n\npeek()");
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s3 -> s3.startsWith("g"))
                .peek(System.out::println).count(); // grizzly
        System.out.println(count); // 1
    }
}
