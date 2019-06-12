package acme.enthuware.standard_tests.test5.test07;

public class Book {
    private String title;
    private String genre;

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
