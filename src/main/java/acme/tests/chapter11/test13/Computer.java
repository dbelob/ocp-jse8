package acme.tests.chapter11.test13;

class Laptop extends Computer {
    String type = "laptop";
}

public class Computer {
    String type = "computer";

    public static void main(String[] args) {
        Computer computer = new Laptop();
        Laptop laptop = new Laptop();
        System.out.print(computer.type + "," + laptop.type);
    }
}
