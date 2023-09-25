package ch05_6_1_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class App_RandomAccessFile {
    public static void main(String[] args) throws IOException {
// create a new RandomAccessFile with filename test
        RandomAccessFile raf = new RandomAccessFile("C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\test_randomAccessFile.txt", "rw");
// write something in the file
        raf.writeUTF("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        raf.seek(0); // set the file pointer at 0 position
        System.out.println("" + raf.readUTF()); // print the string
        raf.seek(6); // set the file pointer at 5 position
        raf.writeUTF("**Over-written text**"); // write something in the file
        raf.seek(0); // set the file pointer at 0 position
        System.out.println("" + raf.readUTF()); // print the string
    }
}
