package acme.tests.chapter18.test23;

import java.io.File;

public class Journey {
    public static void main(String[] dig) {
        File file = new File("/Earth");
        System.out.print(file.getParent()
                + " - "
//                + file.getParent().getParent());
                + file.getParentFile().getParent());
    }
}
