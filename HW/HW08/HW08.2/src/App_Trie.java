/**
 * Project Name : JavaProgramming and Application HW08.2
 * Program's purpose and basic function :
 * - App Trie
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.06
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.06			v1.00			First Write
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class App_Trie {
    public static void main(String[] args) throws FileNotFoundException {
        Trie trie_str = new Trie("Trie_String");
        final String fname = "keywords.txt";    // file name
        Scanner fin = new Scanner(new File(fname));
        String w;
        while(fin.hasNext()) {
            w = fin.next(); // read file
            trie_str.insert(w);
        }
        String[] test_words = {"abcd", "ab", "abc", "k", "x", "z"}; // test word
        for (String kw : test_words) {
            if (trie_str.search(kw)) // search
            {
                System.out.printf("%5s : found in trie\n", kw);
            } else {
                System.out.printf("%5s : not found in trie\n", kw);
            }
        }
        ArrayList<String> keywords;
        keywords = trie_str.getKeywords();
        System.out.printf("Total keywords of %s : ", trie_str.getName());
        for (String word : keywords) {
            System.out.printf("%s ", word);
        }
        System.out.printf("\n");
        String test_keyword = "ab";
        keywords = trie_str.getPredictiveWords(test_keyword); // predictive words
        System.out.printf("Predictive words of %s : ", test_keyword);
        for (String word : keywords) {
            System.out.printf("%s ", word);
        }
        System.out.printf("\n");
    }
}