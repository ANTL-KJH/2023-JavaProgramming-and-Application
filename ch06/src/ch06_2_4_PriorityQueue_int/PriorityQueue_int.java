package ch06_2_4_PriorityQueue_int;
import java.util.PriorityQueue;
public class PriorityQueue_int {
    public static void main(String[] args) {
        PriorityQueue<Integer> priQ_int = new PriorityQueue<Integer>();
        /* Test operations of Priority Queue */
        int[] data_array = {10, 8, 6, 4, 2, 0, 3, 5, 7, 9, 1};
        int num_data = data_array.length;
        int data;
        System.out.print("priQ_int.add() : ");
        for (int i=0; i<num_data; i++) {
            data = data_array[i];
            priQ_int.add(data);
            System.out.print(data + ", ");
        }
        System.out.println();
        System.out.print("priQ_int.poll() : ");
        for (int i=0; i<num_data; i++) {
            data = priQ_int.poll();
            System.out.print(data + ", ");
        }
        System.out.println();
    }
}
