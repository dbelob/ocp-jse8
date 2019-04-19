package acme.tests.chapter13.test22;

class Wash<T> {
    T item;
    public void clean(T item) {
        System.out.println("Clean " + item);
    }
}
public class LaundryTime {
    public static void main(String[] args) {
//        Wash wash = new Wash();
//        Wash wash = new Wash<String>();
        Wash<String> wash = new Wash<>();
        wash.clean("socks");
    }
}
