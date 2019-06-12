package acme.enthuware.standard_tests.test5.test53;

public class Student {
    public static enum Grade {A, B, C, D, F}

    private String name;
    private Grade grade;

    public Student(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + ":" + grade;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }
}
