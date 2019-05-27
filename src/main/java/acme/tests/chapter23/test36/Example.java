package acme.tests.chapter23.test36;

import java.util.ArrayDeque;

public class Example {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.offer(18);

        // A
//        d.peek(); d.peek();

        // B
//        d.poll(); d.poll();

        // C
        d.pop(); d.pop();

        // D
        d.remove(); d.remove();
    }
}
