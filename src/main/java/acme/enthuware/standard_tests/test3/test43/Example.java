package acme.enthuware.standard_tests.test3.test43;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.push(2);
        d.push(3);
        System.out.println(d.remove());
        System.out.println(d.remove());
        System.out.println(d.remove());
    }
}
