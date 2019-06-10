package acme.enthuware.objective_wise_tests.chapter03_generics_and_collections.test09;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);          // 1
        d.offerLast(2);     // 1, 2
        d.push(3);          // 3, 1, 2
        d.peekFirst();         // 3, 1, 2
        d.removeLast();        // 3, 1
        d.pop();               // 1
        System.out.println(d);
    }
}
