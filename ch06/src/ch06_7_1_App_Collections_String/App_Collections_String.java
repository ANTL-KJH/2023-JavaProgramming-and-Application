package ch06_7_1_App_Collections_String;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class App_Collections_String {
    public static void printList(List<String> list_str) {
        Iterator<String> itr = list_str.iterator();
        while(itr.hasNext()) {
            String ent = itr.next();
            System.out.printf("%s ", ent);
        }
    } public static void main(String[] args) {
        ArrayList<String> arrayLst_str = new ArrayList<String>();
        String[] arr_str = {"E", "D", "A", "B", "F", "C", "G"};
        for (String str : arr_str) {
            arrayLst_str.add(str);
        }
        System.out.printf("Before sort(), arrayLst_str = ");
        printList(arrayLst_str); System.out.println();
        Collections.sort(arrayLst_str);
        System.out.printf("After Collections.sort(), arrayLst_str = ");
        printList(arrayLst_str); System.out.println();
        Collections.shuffle(arrayLst_str);
        System.out.printf("After Collections.shuffle(), arrayLst_str = ");
        printList(arrayLst_str); System.out.println();
        Collections.sort(arrayLst_str);
        System.out.printf("After Collections.sort(), arrayLst_str = ");
        printList(arrayLst_str); System.out.println();
        Collections.reverse(arrayLst_str);
        System.out.printf("After Collections.reverse(), arrayLst_str = ");
        printList(arrayLst_str); System.out.println();
        Collections.sort(arrayLst_str);
        System.out.printf("After Collections.sort(), arrayLst_str = ");
        printList(arrayLst_str); System.out.println();
        String max_str, min_str;
        max_str = Collections.max(arrayLst_str);
        min_str = Collections.min(arrayLst_str);
        System.out.printf("min_str = %s, max_str = %s\n", min_str, max_str);
        String search_key = "C";
        int index = Collections.binarySearch(arrayLst_str, "C");
        System.out.printf("Search key(%s) is located at %d\n", search_key, index);
    }
}
