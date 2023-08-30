package ch02_3_3_intArray_sort_print;

import java.util.Scanner;

public class int_array_input_sort_print {
    public static void print_array(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.printf("%3d", array[i]);
        }
        System.out.println();
    } // end print_array()

    public static void get_int_array(Scanner cin, int[] array, int size) {
        int data;
        for (int i = 0; i < size; i++) {
            data = cin.nextInt();
            array[i] = data;
        }
    }

    public static void selection_sort(int[] array, int size) {
        /* sort given array with selection_sort algorithm */
        int temp, min_idx;
        for (int i = 0; i < size - 1; i++) {
            min_idx = i;
            for (int j = i + 1; j < size; j++) {
                if (array[min_idx] > array[j]) {
                    min_idx = j;
                }
            }
            if(min_idx != i)
            {
                temp = array[i];
                array[i] = array[min_idx];
                array[min_idx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Please input number of integers to process : ");
        int num_data = cin.nextInt();
        int data;
        int[] int_array = new int[num_data];
        System.out.print("Please input " + num_data + " integers in a line, separated with space :");
        get_int_array(cin, int_array, num_data);
        System.out.print("Input data : ");
        print_array(int_array, num_data);
        selection_sort(int_array, num_data);
        System.out.print("Sorted input data : ");
        print_array(int_array, num_data);
    }
}
