package acme.study_guide.appendix_b.taking_the_test.using_the_provided_writing_material;

public class Example {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        while (x < y) {
            System.out.println("<><>");
            for (int i = 2; i < 5; i++, x++) {
                x++;
                System.out.println("—");
            }
        }
        System.out.println(x + "," + y);

        String mammal = "DOLPHIN";
        String modified = mammal.substring(2,mammal.indexOf('I'));
        modified += "x" + mammal.substring(4);
        System.out.println(modified);
    }
}
