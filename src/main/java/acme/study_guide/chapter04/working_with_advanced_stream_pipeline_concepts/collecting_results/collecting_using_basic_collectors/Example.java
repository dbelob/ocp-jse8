package acme.study_guide.chapter04.working_with_advanced_stream_pipeline_concepts.collecting_results.collecting_using_basic_collectors;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        // joining()
        System.out.println("joining()");
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result); // lions, tigers, bears

        // averagingInt()
        System.out.println("\naveragingInt()");
        /* Stream<String> */ ohMy = Stream.of("lions", "tigers", "bears");
        Double result2 = ohMy.collect(Collectors.averagingInt(String::length));
        System.out.println(result2); // 5.333333333333333

        // toCollection()
        System.out.println("\ntoCollection()");
        /* Stream<String> */ ohMy = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result3 = ohMy.filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result3); // [tigers]
    }
}
