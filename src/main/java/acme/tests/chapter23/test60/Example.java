package acme.tests.chapter23.test60;

import java.util.Set;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {
        Set<Integer> dice = new TreeSet<>();
        dice.add(6);
        dice.add(6);
        dice.add(4);
//        dice.stream().filter(n -> n != 4).forEach(System.out::println).count();
        dice.stream().filter(n -> n != 4).peek(System.out::println).count();
    }
}
