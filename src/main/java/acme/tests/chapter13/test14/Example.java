package acme.tests.chapter13.test14;

import java.util.LinkedList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Archie");
        list.add("X-Men");
        list.stream().forEach(s -> System.out.println(s));
        list.stream().forEach(s -> System.out.println(s));
    }
}
