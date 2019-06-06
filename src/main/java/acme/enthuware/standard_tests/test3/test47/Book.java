package acme.enthuware.standard_tests.test3.test47;

public class Book {
    String isbn;
    String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public int compareTo(Book b) {
        return this.isbn.compareTo(b.isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
}
