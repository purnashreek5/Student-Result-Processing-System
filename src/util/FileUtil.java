package util;

import java.io.*;

public class FileUtil {

    public static void saveStudent(String data) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data/students.txt", true));
        bw.write(data);
        bw.newLine();
        bw.close();
    }
}
