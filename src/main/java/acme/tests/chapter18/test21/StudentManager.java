package acme.tests.chapter18.test21;

import java.io.*;

class Student implements Serializable {}
public class StudentManager {
    public static void main(String[] grades) {
        try(ObjectInputStream ios = new ObjectInputStream(
                new FileInputStream(new File("C://students.data")))) {
            Student record;
            while((record = (Student)ios.readObject()) != null) {
                System.out.print(record);
            }
        } catch (EOFException e) {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
