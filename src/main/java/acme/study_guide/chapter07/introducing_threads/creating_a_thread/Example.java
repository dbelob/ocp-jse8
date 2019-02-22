package acme.study_guide.chapter07.introducing_threads.creating_a_thread;

public class Example {
    public static void main(String[] args) {
        System.out.println("begin");

//        (new ReadInventoryThread()).start();
//        (new Thread(new PrintData())).start();
//        (new ReadInventoryThread()).start();

        new PrintData().run();
        (new Thread(new PrintData())).run();
        (new ReadInventoryThread()).run();

        System.out.println("end");
    }
}
