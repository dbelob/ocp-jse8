package acme.enthuware.standard_tests.test1.test26;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);                               // 1
        d.push(2);                          // 2, 1
        d.pop();                                // 1
        d.offerFirst(3);                    // 3, 1
        d.remove();                             // 1
        System.out.println(d);
    }
}
