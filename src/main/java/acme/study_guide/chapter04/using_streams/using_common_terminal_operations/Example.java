package acme.study_guide.chapter04.using_streams.using_common_terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        // count()
        System.out.println("count()");
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3

        // min() and max()
        System.out.println("\nmin() and max()");
        /* Stream<String> */ s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println); // ape

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent()); // false

        // findAny() and findFirst()
        System.out.println("\nfindAny() and findFirst()");
        /* Stream<String> */ s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s.findAny().ifPresent(System.out::println); // monkey
        infinite.findAny().ifPresent(System.out::println); // chimp

        // allMatch() , anyMatch() and noneMatch()
        System.out.println("\nallMatch() , anyMatch() and noneMatch()");
        List<String> list = Arrays.asList("monkey", "2", "chimp");
        /* Stream<String> */ infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infinite.anyMatch(pred)); // true

        // forEach()
        System.out.println("\nforEach()");
        /* Stream<String> */ s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print); // MonkeyGorillaBonobo

        // reduce()
        System.out.println("\n\nreduce()");
        String[] array = new String[] { "w", "o", "l", "f" };
        String result = "";
        for (String ss: array) result = result + ss;
        System.out.println(result);

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (ss, c) -> ss + c);
        System.out.println(word); // wolf

        /* Stream<String> */ stream = Stream.of("w", "o", "l", "f");
        /* String */ word = stream.reduce("", String::concat);
        System.out.println(word); // wolf

        // collect()
        System.out.println("\ncollect()");
        /* Stream<String> */ stream = Stream.of("w", "o", "l", "f");
        StringBuilder word1 = stream.collect(StringBuilder::new,
                StringBuilder::append, StringBuilder::append);
        System.out.println(word1.toString());

        /* Stream<String> */ stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add,
                TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]
    }
}
