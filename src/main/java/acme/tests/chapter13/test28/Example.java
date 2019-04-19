package acme.tests.chapter13.test28;

import java.util.TreeMap;

public class Example {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("3", 3);
        map.put("three", 3);
        map.put("THREE", 3);
        System.out.println(map.firstKey() + " " + map.lastKey());
    }
}
