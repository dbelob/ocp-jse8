package acme.tests.chapter13.test09;

import java.util.ArrayList;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(56);
        list.add(3);

        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.print(set.size());
        System.out.print(" ");
        System.out.print(set.iterator().next());
    }
}
