package acme.study_guide.chapter09.review_questions.question12;

import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
//        new Path("jaguar.txt");               //A
//        new FileSystem().getPath("leopard");  //F
//        Paths.getPath("ocelot.txt");          //G
        Paths.get("ocelot.txt");
    }
}
