package acme.study_guide.chapter07.using_concurrent_collections.understanding_memory_consistency_errors;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Example {
    public static void main(String[] args) {
        Map<String, Object> foodData = /* new HashMap<String, Object>(); */ new ConcurrentHashMap<String, Object>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet())
            foodData.remove(key);
    }
}
