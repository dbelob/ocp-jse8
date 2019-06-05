package acme.enthuware.standard_tests.test3.test23;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2, 4, 6, 9); //1
        Predicate<Integer> check = (Integer i) -> {
            System.out.println("Checking");
            return i == 4; //2
        };
        Predicate<Integer> even = (Integer i) -> i % 2 == 0;  //3
        values.stream().filter(check).filter(even).count(); //4
    }
}
