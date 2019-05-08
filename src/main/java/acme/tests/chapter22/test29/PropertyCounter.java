package acme.tests.chapter22.test29;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class PropertyCounter extends ListResourceBundle {
    private int count = 0;
    @Override
    protected Object[][] getContents() {
        return new Object[][] {{ "count", new PropertyCounter() }};
    }
    public int getCount() {
        return count++;
    }
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("acme.tests.chapter22.test29.PropertyCounter");
        PropertyCounter obj = (PropertyCounter) rb.getObject("count");
        System.out.println(obj.getCount() + " " + obj.getCount());
    }
}
