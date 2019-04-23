package acme.tests.chapter15.test19;

import java.util.*;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("tire-");
        List<String> list = new LinkedList<>();
        Deque<String> queue = new ArrayDeque<>();
        queue.push("wheel-");
        Stream.of(set, list, queue)
                .flatMap(x -> x.stream())
                .forEach(System.out::print);
    }
}
