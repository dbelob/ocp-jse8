package acme.study_guide.chapter03.additions_in_java_8.using_new_java_8_map_apis.putifabsent;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
    }
}
