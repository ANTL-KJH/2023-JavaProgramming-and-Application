package ch06_3_1_App_SortedSet;
import java.util.*;
public class App_SortedSet {
    public static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<String>();
        String[] test_strings = {"A", "G", "D", "E", "B", "C", "A", "B", "F"};
        for (String str : test_strings) {
            ts.add(str);
            System.out.printf("After add(%S) : ts = %s\n", str, ts);
        }
        System.out.println();
        String[] remove_strings = {"B", "D", "A", "E", "C"};
        for (String str : remove_strings) {
            ts.remove(str);
            System.out.printf("After removing (%S) : ts = %s\n", str, ts);
        }
    }
}
