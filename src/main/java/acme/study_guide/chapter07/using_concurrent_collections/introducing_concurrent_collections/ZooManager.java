package acme.study_guide.chapter07.using_concurrent_collections.introducing_concurrent_collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZooManager {
    private Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();

    public void put(String key, String value) {
        foodData.put(key, value);
    }

    public Object get(String key) {
        return foodData.get(key);
    }
}
