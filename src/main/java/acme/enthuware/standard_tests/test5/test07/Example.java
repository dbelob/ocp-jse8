package acme.enthuware.standard_tests.test5.test07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Gone with the wind", "Fiction"),
                new Book("Bourne Ultimatum", "Thriller"),
                new Book("The Client", "Thriller"));

        List<String> genreList = new ArrayList<>();

//        books.stream().map(Book::getGenre).forEach(s->genreList.add(s));
//        genreList = books.stream().map(Book::getGenre).collect(Collectors.toList());
//        books.stream().map(Book::getGenre).forEach(genreList::add);
        books.stream().map(b -> b.getGenre()).forEach(genreList::add);

        System.out.println(genreList);
    }
}
