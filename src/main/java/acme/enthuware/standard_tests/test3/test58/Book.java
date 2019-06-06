package acme.enthuware.standard_tests.test3.test58;

public class Book {
    private int id;
    private String title;
    private String genre;
    private String author;
    private double price;

    public Book(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return genre + ":" + title;
    }
}
