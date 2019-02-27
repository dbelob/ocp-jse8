package acme.study_guide.chapter07.using_concurrent_collections.obtaining_synchronized_collections;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(
                new ArrayList<>(Arrays.asList(4, 3, 52)));
        synchronized (list) {
            for (int data : list)
                System.out.print(data + " ");
        }

        Map<String, Object> foodData = new HashMap<String, Object>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
        for (String key : synchronizedFoodData.keySet())
            synchronizedFoodData.remove(key);
    }
}
