package acme.tests.chapter18.test39;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class TextMessage {
    public String receiveText() throws Exception {
        try (Reader r = new FileReader("messages.txt")) {
            StringBuilder s = new StringBuilder();
            int c;
            while((c = r.read()) != -1) {
                s.append((char)c);
                if(r.markSupported()) {
                    r.mark(100);
                    r.skip(10);
                    r.reset();
                }
            }
            return s.toString();
        }
    }
    public void sendText(String message) throws Exception {
        try (Writer w = new FileWriter("messages.txt")) {
            for(int i=0; i<message.length(); i++) {
                w.write(message.charAt(i));
//                w.skip(1);
            }
        }
    }
    public static void main(String[] minutes) throws Exception {
        final TextMessage m = new TextMessage();
        m.sendText("You up?");
        System.out.println(m.receiveText());
    }
}
