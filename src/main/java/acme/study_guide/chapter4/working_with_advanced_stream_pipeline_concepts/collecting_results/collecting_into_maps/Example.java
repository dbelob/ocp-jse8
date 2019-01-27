package acme.study_guide.chapter4.working_with_advanced_stream_pipeline_concepts.collecting_results.collecting_into_maps;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        // toMap()
        System.out.println("toMap()");
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(
                Collectors.toMap(s -> s, String::length));
        System.out.println(map); // {lions=5, bears=5, tigers=6}

        System.out.println("\ntoMap()");
        /* Stream<String> */ ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map2 = ohMy.collect(Collectors.toMap(
                String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        System.out.println(map2); // {5=lions,bears, 6=tigers}
        System.out.println(map2.getClass()); // class. java.util.HashMap

        System.out.println("\ntoMap()");
        /* Stream<String> */ ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> map3 = ohMy.collect(Collectors.toMap(
                String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new));
        System.out.println(map3); // // {5=lions,bears, 6=tigers}
        System.out.println(map3.getClass()); // class. java.util.TreeMap
    }
}
