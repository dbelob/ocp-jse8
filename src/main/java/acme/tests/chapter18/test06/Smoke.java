package acme.tests.chapter18.test06;

import java.io.*;

public class Smoke {
    public void sendAlert(File fn) {
//        try(BufferedWriter w = new BufferedWriter(new FileOutputStream(fn))) {
        try(BufferedWriter w = new BufferedWriter(new FileWriter(fn))) {
            w.write("ALERT!");
            w.flush();
            w.write('!');
            System.out.print("1");
        } catch (IOException e) {
            System.out.print("2");
        } finally {
            System.out.print("3");
        }
    }
    public static void main(String[] testSignal) {
        new Smoke().sendAlert(new File("alarm.txt"));
    }
}
