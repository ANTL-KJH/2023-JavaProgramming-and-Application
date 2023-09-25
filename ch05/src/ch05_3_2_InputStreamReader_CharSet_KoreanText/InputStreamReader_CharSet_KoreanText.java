package ch05_3_2_InputStreamReader_CharSet_KoreanText;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_CharSet_KoreanText {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        String f_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\kor_text.txt";
        try {
            fin = new FileInputStream(f_name);
            in = new InputStreamReader(fin, "UTF-8"); // char set for korean text file reading
            int ch;
            System.out.printf("Encoding char set = %s\n", in.getEncoding());
            while ((ch = in.read()) != -1) {
                System.out.printf("%c", (char)ch);
            }
            in.close();
            fin.close();
        } catch (IOException e) {
            System.out.printf("IOException in Korean text reading !!\n");
        }
    }
}
