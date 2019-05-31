package acme.enthuware.standard_tests.test1.test17;

abstract class Widget {
    String data = "data";

    public void doWidgetStuff() {
    }
}

class GoodWidget extends Widget {
    String data = "big data";

    public void doWidgetStuff() {
        System.out.println(data);
    }
}

public class WidgetUser {
    public static void main(String[] args) {
        Widget w = new GoodWidget();
        w.doWidgetStuff();
        System.out.println(w.data);
    }
}
