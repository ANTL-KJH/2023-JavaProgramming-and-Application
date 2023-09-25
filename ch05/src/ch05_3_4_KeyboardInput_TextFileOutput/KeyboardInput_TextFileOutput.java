package ch05_3_4_KeyboardInput_TextFileOutput;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput_TextFileOutput {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        FileWriter fout = null;
        int ch;
        String fout_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\keyboard_input_text.txt";
        System.out.printf("Input text sentences (Cnrl-z to end) : ");
        try {
            fout = new FileWriter(fout_name);
            while ((ch = in.read()) != -1) {
                fout.write(ch);
            }
            in.close();
            fout.close();
        } catch (IOException e) {
            System.out.printf("Exception in input/out !!\n");
        }
        String fin_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\keyboard_input_text.txt";
        FileInputStream fin = null;
        System.out.printf("\nContents of textfile (%s) :\n", fin_name);
        try {
            fin = new FileInputStream(fin_name);
            in = new InputStreamReader(fin, "UTF-8"); // char set for korean text file reading
            System.out.printf("Encoding char set = %s\n", in.getEncoding());
            while ((ch = in.read()) != -1) {
                System.out.printf("%c", (char) ch);
            }
            in.close();
            fin.close();
        } catch (IOException e) {
            System.out.printf("IOException in text reading !!\n");
        }
    }
}
