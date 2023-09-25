package ch05_1_3_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_FileOutputStream {
    public static void main(String[] args) throws IOException {
        final String data_file_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\test_data.bin";
        FileOutputStream fout = new FileOutputStream(data_file_name);
        int test_data[] = {1, 3, 5, 7, 9, -1, -3, -5, -7, -9};
        byte byte_data[] = {(byte)(0xAB), (byte)(0xCD), (byte)(0xEF), (byte)(0x33), (byte)(0xFF)};
        for (int i=0; i<test_data.length; i++) {
            fout.write(test_data[i]); //
        } fout.write(byte_data); // file output of byte_data array
        fout.close();
        FileInputStream fin = null;
        fin = new FileInputStream(data_file_name);
        int ch;
        System.out.printf("contents of C:\\\\Temp_JavaProg\\\\test_data.bin : \n");
        while ((ch = fin.read()) != -1) {
            System.out.printf("%X ", ch);
        } fin.close();
    }
}
