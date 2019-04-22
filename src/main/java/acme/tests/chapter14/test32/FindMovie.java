package acme.tests.chapter14.test32;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FindMovie {
//    private Function<String> printer;
    private Function<String, String> printer;

    protected FindMovie() {
        printer = s -> {
            System.out.println(s);
            return s;
        };
    }

    void printMovies(List<String> movies) {
//        movies.forEach(printer);
    }

    public static void main(String[] screen) {
        List<String> movies = new ArrayList<>();
        movies.add("Stream 3");
        movies.add("Lord of the Recursion");
        movies.add("Silence of the Lambdas");
        new FindMovie().printMovies(movies);
    }
}
