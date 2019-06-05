package acme.enthuware.standard_tests.test3.test13;

public class Course {
    private String id;
    private String category;

    public Course(String id, String category) {
        this.id = id;
        this.category = category;
    }

    public String toString() {
        return id + " " + category;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }
}
