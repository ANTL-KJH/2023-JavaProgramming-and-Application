package ch06_2_4_ArrayDeque;
import java.util.ArrayDeque;
public class App_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> arrDq_str = new ArrayDeque<>();
        char ch = 'A';
        String str;
        for (int i=0; i<5; i++) {
            arrDq_str.addFirst("" + ch);
            System.out.println("after addFirst(" + ch + "), arrDq_str:" + arrDq_str);
            ch += 1;
        }
        for (int i=0; i<5; i++) {
            arrDq_str.addLast("" + ch);
            System.out.println("after addLast(" + ch + "), arrDq_str:" + arrDq_str);
            ch += 1;
        }
        for (int i=0; i<5; i++) {
            str = arrDq_str.removeFirst();
            System.out.println("after removeFirst() : " + str + ", arrDq_str:" + arrDq_str);
        }
        for (int i=0; i<5; i++) {
            str = arrDq_str.removeLast();
            System.out.println("after removeLast() : " + str + ", arrDq_str:" + arrDq_str);
        }
    }
}
