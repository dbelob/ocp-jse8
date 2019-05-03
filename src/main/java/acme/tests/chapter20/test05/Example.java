package acme.tests.chapter20.test05;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example {
    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        List<Integer> copy1 = new CopyOnWriteArrayList<>(original);
        for(Integer w : copy1)
            copy1.remove(w);

//        List<Integer> copy2 = Collections.synchronizedList(original);
//        for(Integer w : copy2)
//            copy2.remove(w);

//        List<Integer> copy3 = new ArrayList<>(original);
//        for(Integer w : copy3)
//            copy3.remove(w);

        Queue<Integer> copy4 = new ConcurrentLinkedQueue<>(original);
        for(Integer w : copy4)
            copy4.remove(w);
    }
}
