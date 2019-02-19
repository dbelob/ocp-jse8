package acme.study_guide.chapter06.working_with_assertions.the_assert_statement;

public class Assertions {
    public static void main(String[] args) {
        int numGuests = -5;
        assert numGuests > 0;
        System.out.println(numGuests);
    }
}
