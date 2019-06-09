package acme.enthuware.standard_tests.test4.test40;

import java.io.*;

public class FileCopier {
    public static void copy(String records1, String records2) {
        try (InputStream is = new FileInputStream(records1);
             OutputStream os = new FileOutputStream(records2);) {  //1
//            if (os == null) os = new FileOutputStream("c:\\default.txt");  //2
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {  //3
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        } catch (IOException e) { //4
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copy("c:\\temp\\test1.txt", "c:\\temp\\test2.txt");
    }
}
