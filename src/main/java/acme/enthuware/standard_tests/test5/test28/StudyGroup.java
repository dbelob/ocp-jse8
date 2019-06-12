package acme.enthuware.standard_tests.test5.test28;

import java.util.TreeSet;

class Person {
    private static int count = 0;
    private String id = "0";
    private String interest;

    public Person(String interest) {
        this.interest = interest;
        this.id = "" + ++count;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String toString() {
        return id;
    }
}

public class StudyGroup {
    String name = "MATH";
    TreeSet<Person> set = new TreeSet<Person>();

    public void add(Person p) {
        if (name.equals(p.getInterest())) set.add(p);
    }

    public static void main(String[] args) {
        StudyGroup mathGroup = new StudyGroup();
        mathGroup.add(new Person("MATH"));
        System.out.println("A");
        mathGroup.add(new Person("MATH"));
        System.out.println("B");
        System.out.println(mathGroup.set);
    }
}
