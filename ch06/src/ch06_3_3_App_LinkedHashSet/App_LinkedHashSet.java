package ch06_3_3_App_LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class App_LinkedHashSet {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        String[] test_strings = {"A", "G", "D", "E", "B", "C", "A", "B", "F"};
        for (String str : test_strings) {
            linkedHashSet.add(str);
            System.out.printf("After add(%S) : ts = %s\n", str, linkedHashSet);
        }
        System.out.println();
        String[] remove_strings = {"B", "D", "A", "E", "C"};
        for (String str : remove_strings) {
            linkedHashSet.remove(str);
            System.out.printf("After removing (%S) : ts = %s\n", str, linkedHashSet);
        }
    }
}
