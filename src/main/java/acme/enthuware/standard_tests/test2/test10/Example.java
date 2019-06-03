package acme.enthuware.standard_tests.test2.test10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Example {
    public static void main(String[] args) {
        List<String> vowels = new ArrayList<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        Function<List<String>, List<String>> f = list -> list.subList(2, 4);
        f.apply(vowels);

        List<String> view = f.apply(vowels);    //get a view backed by the original list
        view.add("x");//modify the view

        vowels.forEach(System.out::print);
    }
}
