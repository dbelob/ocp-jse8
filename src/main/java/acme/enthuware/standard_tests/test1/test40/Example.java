package acme.enthuware.standard_tests.test1.test40;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3, 4, 6, 9, 2, 5, 7);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b)); //1
        System.out.println(ls.stream().max(Integer::max).get()); //2
        System.out.println(ls.stream().max(Integer::compare).get()); //3
        System.out.println(ls.stream().max((a, b) -> a > b ? a : b)); //4
    }
}
