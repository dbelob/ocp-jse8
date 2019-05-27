package acme.tests.chapter23.test83;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Example {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("speak", "bark", "meow", "growl");
        Map<Integer, String> map = s.collect(toMap(String::length, k -> k/* , (a, b) -> a */));
        System.out.println(map.size() + " " + map.get(4));
    }
}
