package acme.enthuware.standard_tests.test3.test24;

import java.util.Arrays;

public class Example {
    static String[] sa = { "d", "bbb", "aaaa" };

    public static void main(String[] args) {
        System.out.println(Arrays.binarySearch(sa, "cc", new MyStringComparator()));    // -(1)-1 = -2
        System.out.println(Arrays.binarySearch(sa, "c", new MyStringComparator()));     // 0
    }
}
