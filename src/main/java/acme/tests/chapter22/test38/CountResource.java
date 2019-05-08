package acme.tests.chapter22.test38;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class CountResource extends ListResourceBundle {
    private int count = 0;
    @Override
    protected Object[][] getContents() {
        return new Object[][] { { "count", count++ } };
    }
    public static void main(String[] args) {
//        ResourceBundle rb = new ResourceBundle("acme.tests.chapter22.test38.CountResource");
        ResourceBundle rb = ResourceBundle.getBundle("acme.tests.chapter22.test38.CountResource");
        System.out.println(rb.getObject("count") + " " + rb.getObject("count"));
    }
}
