package acme.study_guide.chapter4.review_questions.question11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        System.out.print(Stream.iterate(1, x -> ++x)
                .limit(5)
                .map(x -> "" + x)
                .collect(Collectors.joining()));
    }
}