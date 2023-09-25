package ch05_1_1_File_IO_Scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File_IO_Scanner {
    public static void main(String[] args) throws IOException {
        final String input_file_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\student_records.txt";
        Scanner fin = new Scanner(new File(input_file_name));
        while (fin.hasNext()) {
            String name = fin.next();
            int kor_score = fin.nextInt();
            int eng_score = fin.nextInt();
            int math_score = fin.nextInt();
            System.out.printf("%8s %3d %3d %3d\n", name, kor_score, eng_score, math_score);
        } // end while
    }
}
