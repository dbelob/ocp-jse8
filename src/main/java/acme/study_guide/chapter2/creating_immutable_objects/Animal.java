package acme.study_guide.chapter2.creating_immutable_objects;

import java.util.ArrayList;
import java.util.List;

public final class Animal {
    private final List<String> favoriteFoods;
    public Animal(List<String> favoriteFoods) {
        if(favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }
    public List<String> getFavoriteFoods() { // MAKES CLASS MUTABLE!
        return favoriteFoods;
    }
    public static void main(String[] args) {
        List<String> favoriteFoods = new ArrayList<String>() {{
            add("One");
            add("Two");
            add("Three");
        }};
        
        Animal animal = new Animal(favoriteFoods);
    }
}