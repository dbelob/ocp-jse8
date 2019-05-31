package acme.enthuware.standard_tests.test1.test69;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TestFrame extends Frame {
    static String s = "Message";

    public static void main(String args[]) {
        TestFrame t = new TestFrame();
        Button b = new Button("press me");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Message is " + s);
            }
        });
        t.add(b);
    }
}
