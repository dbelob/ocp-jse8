package acme.enthuware.standard_tests.test5.test14;

public class SpecialPicker<K> {
    public K pickOne(K k1, K k2) {
        return k1.hashCode() > k2.hashCode() ? k1 : k2;
    }
}
