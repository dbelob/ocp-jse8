package acme.tests.chapter12.test02;

enum DaysOff {
    Thanksgiving, PresidentsDay, ValentinesDay
}

public class Vacation {
    public static void main(String... unused) {
        final DaysOff input = DaysOff.Thanksgiving;
        switch(input) {
            default:
//            case DaysOff.ValentinesDay:
            case ValentinesDay:
                System.out.print("1");
//            case DaysOff.PresidentsDay:
            case PresidentsDay:
                System.out.print("2");
        }
    }
}
