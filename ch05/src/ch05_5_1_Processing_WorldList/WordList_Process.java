package ch05_5_1_Processing_WorldList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WordList_Process {
    public static void main(String[] args) throws IOException {
        final String input_file_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\numbers.txt";
        final int MAX_NUM_WORDS = 10;
        Scanner fin = new Scanner(new File(input_file_name));
        String[] words = new String[MAX_NUM_WORDS];
        System.out.printf("Words in text file (%s) :\n", input_file_name);
        int count = 0;
        while (fin.hasNext() && (count < MAX_NUM_WORDS)) {
            String word = fin.next();
            words[count++] = word;
            System.out.printf("%8s", word);
        }
        Arrays.sort(words);
        System.out.printf("\nWords after sorting :\n");
        String formattedStr = null;
        final String output_file_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch05\\sorted_numbers.txt";
        FileWriter fout = new FileWriter(output_file_name);
        for (int i=0; i<MAX_NUM_WORDS; i++) {
            System.out.printf("%8s", words[i]);
            formattedStr = String.format("%8s", words[i]);
            fout.write(formattedStr);
            if (((i+1) % 5) == 0) {
                fout.write("\n");
            }
        } fout.close();
        System.out.printf("\nSorted words are written into output file (%s)\n", output_file_name);
    }
}
