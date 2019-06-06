package acme.enthuware.standard_tests.test3.test58;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("There is a hippy on the highway", "Thriller", "James Hadley Chase"),
                new Book("Coffin from Hongkong", "Thriller", "James Hadley Chase"),
                new Book("The Client", "Thriller", "John Grisham"),
                new Book("Gone with the wind", "Fiction", "Margaret Mitchell")
        );

        Map<String, Map<String, List<Book>>> classified = null;
        classified = books.stream().collect(Collectors.groupingBy(
                Book::getGenre, Collectors.groupingBy(Book::getAuthor)
//                Book::getGenre, Collectors.mapping(Book::getAuthor, Collectors.toList())
        ));
        System.out.println(classified);

        Map<String, List<String>> classified2 = null;
        classified2 = books.stream().collect(Collectors.groupingBy(
                Book::getGenre, Collectors.mapping(Book::getAuthor, Collectors.toList())
        ));
        System.out.println(classified2);
    }
}
