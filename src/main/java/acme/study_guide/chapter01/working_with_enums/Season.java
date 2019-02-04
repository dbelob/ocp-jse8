package acme.study_guide.chapter01.working_with_enums;

public enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    private String expectedVisitors;

    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}
