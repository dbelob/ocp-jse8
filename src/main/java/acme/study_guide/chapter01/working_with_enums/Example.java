package acme.study_guide.chapter01.working_with_enums;

public class Example {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        Season s1 = Season.valueOf("SUMMER"); // SUMMER
//        Season s2 = Season.valueOf("summer"); // exception

        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("Is it summer yet?");
        }
    }
}
