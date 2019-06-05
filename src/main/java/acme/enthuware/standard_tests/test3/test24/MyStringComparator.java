package acme.enthuware.standard_tests.test3.test24;

import java.util.Comparator;

public class MyStringComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int s1 = ((String) o1).length();
        int s2 = ((String) o2).length();
        return s1 - s2;
    }
}
