package acme.study_guide.chapter4.review_questions.question10;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Stream.generate(() -> "1")
                .limit(10)
                .forEach(System.out::println);
    }
}