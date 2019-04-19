package acme.tests.chapter13.test04;

import java.util.Collection;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {
//        Collection<String> c = new ArrayDeque<>();
//        Collection<String> c = new TreeMap<>();
        Collection<String> c = new TreeSet<>();
        c.add("pen");
        c.remove("pen");
        System.out.println(c.isEmpty());
    }
}
