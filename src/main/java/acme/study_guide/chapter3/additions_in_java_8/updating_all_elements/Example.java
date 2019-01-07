package acme.study_guide.chapter3.additions_in_java_8.updating_all_elements;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.replaceAll(x -> x * 2);
        System.out.println(list); // [2, 4, 6]
    }
}