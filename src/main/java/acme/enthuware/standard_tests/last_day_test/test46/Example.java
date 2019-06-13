package acme.enthuware.standard_tests.last_day_test.test46;

import java.util.ArrayList;

class Book {
}

class TextBook extends Book {
}

class BookList extends ArrayList<Book> {
    public int count = 0;

//    public boolean add(Object o) {
//        if (o instanceof Book) return super.add((Book) o);
//        else return count++ == -1;
//    }
}

public class Example {
    public static void main(String[] args) {
        BookList list = new BookList();
        list.add(new Book());
        list.add(new TextBook());
//        list.add("hello");

        System.out.println(list.count);
    }
}
