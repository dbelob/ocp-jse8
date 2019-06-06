package acme.enthuware.standard_tests.test3.test74;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

public class Example {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Gone with the wind", 5.0),
                new Book("Gone with the wind", 10.0),
                new Book("Atlas Shrugged", 15.0));
        books.stream().collect(Collectors.toMap((b -> b.getTitle()), b -> b.getPrice()))
                .forEach((a, b) -> System.out.println(a + " " + b));
    }
}
