package acme.enthuware.standard_tests.test1.test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

// Given:
public class Example {
    public static void main(String[] args) {
        Map hm = new ConcurrentHashMap();
        hm.put(null, "asdf");   //1
        hm.put("aaa", null);    //2

        hm = new HashMap();
        hm.put(null, "asdf");   //3
        hm.put("aaa", null);    //4

        List list = new ArrayList();
        list.add(null);         //5
        list.add(null);         //6

        list = new CopyOnWriteArrayList();
        list.add(null);         //7
    }
}
// Which of the above lines will throw NullPointerException?
// (Assume that each of the put and add calls are executed as if they are wrapped inside a try/catch block i.e.
// an exception thrown at //1 will not prevent the execution of //2.)
