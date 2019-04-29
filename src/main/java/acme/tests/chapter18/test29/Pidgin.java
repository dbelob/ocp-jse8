package acme.tests.chapter18.test29;

import java.io.*;

public class Pidgin {
    public void copyPidgin(File s, File t) throws Exception {
        try(InputStream is = new FileInputStream(s);
            OutputStream os = new FileOutputStream(t)) {
            byte[] data = new byte[123];
            int chirps;
            while((chirps = is.read(data))>0) {
//                os.write(data);
                os.write(data, 0, chirps);
            }}
    }
}
