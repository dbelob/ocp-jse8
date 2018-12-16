package acme.study_guide.assessment.test10;

public class AssertDemo {
    public static void main(String[] args) {
        Integer x = 10;
        x++;
        assert x == null && x >= 0;
        System.out.println(x);
    }
}