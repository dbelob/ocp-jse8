package acme.enthuware.standard_tests.test3.test13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Course> s1 = Arrays.asList(
                new Course("OCAJP", "Java"),
                new Course("OCPJP", "Java"),
                new Course("C#", "C#"),
                new Course("OCEJPA", "Java"));
        s1.stream().collect(Collectors.groupingBy(c -> c.getCategory()))
                .forEach((m, n) -> System.out.println(n));
    }
}
