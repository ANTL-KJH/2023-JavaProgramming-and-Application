package ch06_4_1_HashSet_Intersection_Union_Difference;
import java.util.*;
public class App_HashSet_Intersection_Union_Difference {
    public static void main(String[] args) {
        String[] strArray_1 = {"A", "B", "C", "D", "E"};
        String[] strArray_2 = { "D", "E", "F", "G"};
        String[] strArray_3 = { "X", "Y", "Z"};
        HashSet<String> hset_11 = new HashSet<String>();
        HashSet<String> hset_12 = new HashSet<String>();
        HashSet<String> hset_2 = new HashSet<String>();
        HashSet<String> hset_3 = new HashSet<String>();
        for (String s : strArray_1) {
            hset_11.add(s);
            hset_12.add(s);
        }
        for (String s : strArray_2) {
            hset_2.add(s);
        }
        for (String s : strArray_3) {
            hset_3.add(s);
        }
        System.out.println("HashSet_11 = " + hset_11);
        System.out.println("HashSet_2 = " + hset_2);
        System.out.println("HashSet_3 = " + hset_3);
        hset_11.retainAll(hset_2);
        System.out.println("After hset_11.retainAll(hset_2), hset_11 = " + hset_11);
        hset_12.removeAll(hset_2);
        System.out.println("After hset_12.removeAll(hset_2), hset_12 = " + hset_12);
        hset_12.addAll(hset_11);
        System.out.println("After hset_12.addAll(hset_11), hset_12 = " + hset_12);
        hset_12.addAll(hset_3);
        System.out.println("After hset_12.addAll(hset_3), hset_12 = " + hset_12);
        hset_12.addAll(hset_2);
        System.out.println("After hset_12.addAll(hset_2), hset_12 = " + hset_12);
        hset_12.removeAll(hset_2);
        System.out.println("After hset_12.removeAll(hset_2), hset_12 = " + hset_12);
    }
}
