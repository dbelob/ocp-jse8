package acme.study_guide.chapter03.additions_in_java_8.using_new_java_8_map_apis.computeifpresent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Example {
    public static void main(String[] args) {
        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny", 1);

        BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
        Integer jenny = counts.computeIfPresent("Jenny", mapper);
        Integer sam = counts.computeIfPresent("Sam", mapper);
        System.out.println(counts); // {Jenny=2}
        System.out.println(jenny);  // 2
        System.out.println(sam);    // null
    }
}
