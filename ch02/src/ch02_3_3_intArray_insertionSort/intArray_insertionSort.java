package ch02_3_3_intArray_insertionSort;

import java.util.Scanner;

public class intArray_insertionSort {
    public static void print_array(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.printf("%3d", array[i]);
        }
        System.out.println();
    }

    public static void insertion_sort(int[] array, int size) {
        /* sort given array with insertion_sort algorithm */
        int temp, in, out;
        for (out = 1; out <= (size - 1); out++) {
            temp = array[out];
            in = out;
            for (; in > 0 && array[in - 1] >= temp; --in) {
                array[in] = array[in - 1]; // shift right to make a room
            }
            array[in] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Please input number of integers to process : ");
        int num_data = cin.nextInt();
        int data;
        int[] int_array = new int[num_data];
        System.out.print("Please input " + num_data + " integers in a line, separated with space :");
        for (int i = 0; i < num_data; i++) {
            data = cin.nextInt();
            int_array[i] = data;
        }
        System.out.print("Input data : ");
        print_array(int_array, num_data);
        insertion_sort(int_array, num_data);
        System.out.print("Sorted input data : ");
        print_array(int_array, num_data);
    }
}
