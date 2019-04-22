package acme.tests.chapter14.test36;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DogSearch {
    void reduceList(List<String> names, Predicate<String> tester) {
        names.removeIf(tester);
    }
    public static void main(String[] treats) {
        int MAX_LENGTH = 2;
        DogSearch search = new DogSearch();
        List<String> names = new ArrayList<>();
        names.add("Lassie");
        names.add("Benji");
        names.add("Brian");
        MAX_LENGTH += names.size();
//        search.reduceList(names, d -> d.length()>MAX_LENGTH);
        System.out.print(names.size());
    }
}
