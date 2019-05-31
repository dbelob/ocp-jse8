package acme.enthuware.standard_tests.test1.test19;

import java.util.function.DoubleSupplier;

public class Book {
    private String title;
    private Double price;

    public Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java in 24 hrs", null);
        DoubleSupplier ds1 = b1::getPrice;
        System.out.println(b1.getTitle() + " " + ds1.getAsDouble());
    }
}
