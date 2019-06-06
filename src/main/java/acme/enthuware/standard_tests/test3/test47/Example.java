package acme.enthuware.standard_tests.test3.test47;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {
    private static List<Book> getBooksByAuthor(String author) {
        return Arrays.asList(
                new Book("111", "Title1"),
                new Book("222", "Title2"));
    }

    public static void main(String[] args) {
        List<Book> books = getBooksByAuthor("Ludlum");
        Collections.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle())); //1
//        Collections.sort(books); //2
    }
}
