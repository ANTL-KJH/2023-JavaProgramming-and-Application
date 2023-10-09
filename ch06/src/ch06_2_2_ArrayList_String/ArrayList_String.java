package ch06_2_2_ArrayList_String;
import java.util.*;
public class ArrayList_String {
    public static void main(String[] args) {
        String fruit_name;
        ArrayList<String> arrLst_fruits = new ArrayList<String>();
        Scanner cin = new Scanner(System.in);
        System.out.print("input a list of fruit names (put . at end): ");
        while(cin.hasNext()) {
            fruit_name = cin.next();
            if (fruit_name.equals("."))
                break;
            arrLst_fruits.add(fruit_name);
        } int num_fruit_names =
                arrLst_fruits.size();
        System.out.printf("\nNumber of input fruit-names = %s\n", num_fruit_names);
        System.out.print("\nArrayList of fruits : ");
        for (int i=0; i<num_fruit_names; i++) {
            fruit_name = arrLst_fruits.get(i);
            System.out.printf("%s ", fruit_name);
        }
        System.out.println();
        int longestIndex = 0;
        for (int i=1; i<num_fruit_names; i++) {
            if (arrLst_fruits.get(longestIndex).length() < arrLst_fruits.get(i).length()) {
                longestIndex = i;
            }
        }
        System.out.println("The longest name of input fruits : " + arrLst_fruits.get(longestIndex));
    }
}
