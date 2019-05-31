package acme.enthuware.standard_tests.test1.test20;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(11, 11, 22, 33, 33, 55, 66);

        System.out.println("anyMatch: " + ls.stream().distinct()
                .peek(System.out::println)
                .anyMatch(x->x==11));
        System.out.println("noneMatch: " + ls.stream()
                .peek(System.out::println)
                .noneMatch(x->x%11>0));
    }
}
