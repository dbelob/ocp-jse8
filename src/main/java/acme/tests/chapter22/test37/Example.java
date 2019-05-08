package acme.tests.chapter22.test37;

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class Example {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("tool", "hammer");
        map.put("problem", "nail");

//        Property props = new Property(); // p1
        Properties props = new Properties(); // p1
        map.forEach((k,v) -> props.put(k, v)); // p2

        String t = props.getProperty("tool"); // p3
        String n = props.getProperty("nail");
        System.out.println(t + " " + n);
    }
}
