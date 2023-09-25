package ch05_3_1_Java_FileReader;

import java.io.FileReader;
import java.io.IOException;

public class Java_FileReader {
    public static void main(String[] args) throws IOException {
        final String file_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\student_records.txt";
        FileReader fin = null;
        fin = new FileReader(file_name);
        int ch;
        while ((ch = fin.read()) != -1) {
            System.out.print((char) ch);
        } fin.close();
    }
}
