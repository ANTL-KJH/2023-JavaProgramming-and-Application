package ch05_1_2_FileInputStream;
import java.io.*;
public class FileInputStream_Ex{
        public static void main(String[] args) throws IOException {
            final String input_file_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\student_records.txt";
            FileInputStream fin = new FileInputStream(input_file_name);
            int ch;
            while ((ch = fin.read()) != -1) {
                System.out.printf("%c", ch);
            } fin.close();
        }
}
