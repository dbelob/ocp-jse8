package acme.enthuware.standard_tests.test4.test17;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17); //1
        Stream<Integer> primeStream = primes.stream(); //2
        Predicate<Integer> test1 = k -> k < 10; //3
//        long count1 = primeStream.filter(test1).count();//4
//        Predicate<Integer> test2 = k -> k > 10; //5
//        long count2 = primeStream.filter(test2).count(); //6
//        System.out.println(count1 + " " + count2); //7

        primeStream.collect(Collectors.partitioningBy(test1, Collectors.counting()))
                .values().forEach(System.out::print);
    }
}
