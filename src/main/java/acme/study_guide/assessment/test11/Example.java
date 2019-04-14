package acme.study_guide.assessment.test11;

import java.util.Optional;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
//        magic(Stream.empty());
        magic(Stream.of(5, 10));
    }

    private static void magic(Stream<Integer> s) {
        Optional o = s.filter(x -> x < 5).limit(3).max((x, y) -> x - y);
        System.out.println(o.get());
    }
}
