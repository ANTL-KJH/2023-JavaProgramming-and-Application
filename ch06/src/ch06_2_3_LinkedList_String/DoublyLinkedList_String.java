package ch06_2_3_LinkedList_String;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.*;
public class DoublyLinkedList_String {
    static void printList(LinkedList<String> ll) {
        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
            String e = itr.next();
            String separator;
            if (itr.hasNext())
                separator = " ";
            else
                separator = "\n";
            System.out.print(e + separator);
        }
    }
    public static void main(String[] args) {
        LinkedList<String> lnkdLst_fruits = new LinkedList<String>();
        String fruit_name;
        Scanner cin = new Scanner(System.in);
        System.out.print("input a list of fruit names (put . at end): ");
        while(cin.hasNext()) {
            fruit_name = cin.next();
            if (fruit_name.equals("."))
                break;
            lnkdLst_fruits.add(fruit_name);
        }
        System.out.println("Before Sorting of LinkedList of fruits = ");
        printList(lnkdLst_fruits);
        Collections.sort(lnkdLst_fruits);
        System.out.println("Sorted LinkedList of fruits = ");
        printList(lnkdLst_fruits);
    }
}
