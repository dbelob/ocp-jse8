package acme.tests.chapter13.test13;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Monday");
//        list.add(String::new);
        list.add(new String());
        list.add("Tuesday");
        list.remove(0);
        System.out.println(list.get(0));
    }
}
