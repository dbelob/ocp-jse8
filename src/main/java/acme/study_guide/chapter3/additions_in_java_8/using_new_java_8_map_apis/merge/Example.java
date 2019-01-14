package acme.study_guide.chapter3.additions_in_java_8.using_new_java_8_map_apis.merge;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Example {
    public static void main(String[] args) {
        BiFunction<String, String, String> mapper = (v1, v2)
                -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");

        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);

        System.out.println(favorites);  // {Tom=Skyride, Jenny=Bus Tour}
        System.out.println(jenny);      // Bus Tour
        System.out.println(tom);        // Skyride
    }
}