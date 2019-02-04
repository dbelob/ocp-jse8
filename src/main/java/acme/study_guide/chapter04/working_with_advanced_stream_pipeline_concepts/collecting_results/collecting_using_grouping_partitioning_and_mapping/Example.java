package acme.study_guide.chapter04.working_with_advanced_stream_pipeline_concepts.collecting_results.collecting_using_grouping_partitioning_and_mapping;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        // groupingBy()
        System.out.println("groupingBy()");
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}

        System.out.println("\ngroupingBy()");
        /* Stream<String> */ ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map2 = ohMy.collect(
                Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map2); // {5=[lions, bears], 6=[tigers]}

        // partitioningBy()
        System.out.println("\npartitioningBy()");
        /* Stream<String> */ ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map3 = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map3); // {false=[tigers], true=[lions, bears]}
    }
}
