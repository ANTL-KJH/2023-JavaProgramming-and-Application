package ch08_Trie;
import java.util.ArrayList;
public class App_Trie {
    public static void main(String[] args) {
        Trie trie_str = new Trie("Trie_String");
        String[] words = {"byc", "b", "abcd", "ab", "abc", "ax", "by", "a", "about", "abbey"};
        for (String w : words) {
            trie_str.insert(w); }
        String[] test_words = {"abcd", "ab", "abc", "k", "x", "z"};
        for (String w : test_words) {
            if (trie_str.search(w)) {
                System.out.printf("%5s : found in trie\n", w);
            } else {
                System.out.printf("%5s : not found in trie\n", w); } }
        ArrayList<String> keywords;
        keywords = trie_str.getKeywords();
        System.out.printf("Total keywords of %s : ", trie_str.getName());
        for (String word : keywords) {
            System.out.printf("%s ", word); }
        System.out.printf("\n");String test_keyword = "ab";
        keywords = trie_str.getPredictiveWords(test_keyword);
        System.out.printf("Predictive words of %s : ", test_keyword);
        for (String word : keywords) {
            System.out.printf("%s ", word);
        }
        System.out.printf("\n");
    }
}