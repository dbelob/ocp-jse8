package acme.study_guide.assessment.test03;

import java.io.*;

public class Bird implements Serializable {
private String name;
private transient int age;
private Tail tail;

public String getName() { return name; }
public Tail getTail() { return tail; }
    public void setName(String name) { this.name = name; }
    public void setTail(Tail tail) { this.tail = tail; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public void main(String[] args) {
//        try(InputStream is = new ObjectInputStream(
//            new BufferedInputStream(new FileInputStream("birds.dat")))) {
//            Bird bird = is.readObject();
//        }
    }
}