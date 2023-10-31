package ch08_HashCode;

public class Test_HashCode_String {
    public static void main(String[] args) {
        String[] words = { "AAA", "BBB", "CCC", "DDD", "AAA"};
        int hashCode;
        for (int i=0; i<words.length; i++) {
            hashCode = words[i].hashCode();
            System.out.printf("words[%d] : %s : hashCode = %10d\n", i, words[i], hashCode);
        }
        if (words[0] == words[4]) {
            System.out.printf("words[0] == words[4] => true\n");
        } else {
            System.out.printf("words[0] == words[4] => false\n");
        }
        if (words[0].equals(words[4])) {
            System.out.printf("words[0].equals(words[4]) => true\n");
        } else {
            System.out.printf("words[0].equals(words[4]) => false\n");
        }
    }
}
