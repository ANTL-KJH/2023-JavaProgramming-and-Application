package ch02_8_2_for_break_continue;

import java.util.Scanner;

public class for_loop_with_break_continue {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Please input upto 10 integers to process (put -9999 at end): ");
        int[] data_array = new int[20];
        int data;
        int data_count = 0;
        for (int i = 0; i < 20; i++) {
            data = cin.nextInt();
            if (data == -9999)
                break;
            else if ((data % 2) == 0) // exclude even numbers
                continue;
            data_array[data_count] = data;
            data_count++;
        }
        System.out.printf("Total %d odd integers from input data : ", data_count);
        for (int i = 0; i < data_count; i++) {
            System.out.printf("%3d ", data_array[i]);
        }
        System.out.print("\n");
        cin.close();
    }
}
