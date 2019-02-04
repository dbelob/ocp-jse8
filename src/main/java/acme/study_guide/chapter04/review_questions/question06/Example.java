package acme.study_guide.chapter04.review_questions.question06;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Stream<String> s = Stream.generate(() -> "meow");
        boolean match = s.allMatch(String::isEmpty);
        System.out.println(match);
    }
}
