package acme.study_guide.chapter07.identifying_threading_problems.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fox {
    private String name;

    public Fox(String name) {
        this.name = name;
    }

    public void eatAndDrink(Food food, Water water) {
        synchronized(food) {
            System.out.println("Got Food! (" + name + ")");
            move();
            synchronized(water) {
                System.out.println("Got Water! (" + name + ")");
            }
        }
    }

    public void drinkAndEat(Food food, Water water) {
        synchronized(water) {
            System.out.println("Got Water! (" + name + ")");
            move();
            synchronized(food) {
                System.out.println("Got Food! (" + name + ")");
            }
        }
    }

    public void move() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // Handle exception
        }
    }

    public static void main(String[] args) {
        // Create participants and resources
        Fox foxy = new Fox("Foxy");
        Fox tails = new Fox("Tails");
        Food food = new Food();
        Water water = new Water();

        // Process data
        ExecutorService service = null;
        try {
            service = Executors.newScheduledThreadPool(10);
            service.submit(() -> foxy.eatAndDrink(food,water));
            service.submit(() -> tails.drinkAndEat(food,water));
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
