package acme.enthuware.standard_tests.test5.test14;

public class Example {
    public static void main(String[] args) {
        SpecialPicker<Integer> sp = new SpecialPicker<>(); //1
        System.out.println(sp.pickOne(1, 2).intValue() + 1); //2
    }
}
