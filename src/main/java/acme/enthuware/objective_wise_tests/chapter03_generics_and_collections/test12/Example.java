package acme.enthuware.objective_wise_tests.chapter03_generics_and_collections.test12;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);           // 1
        d.addFirst(2);   // 2, 1
        d.pop();            // 1
        d.offerFirst(3); // 3, 1
        System.out.println(d);
    }
}
