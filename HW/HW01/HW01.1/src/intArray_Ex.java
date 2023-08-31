/*
 * Project Name : JavaProgramming and Application HW01.1
 * Program's purpose and basic function :
 * - Sort and print the input int array
 * Program First Author : JH KIM
 * Date of First Write : 2023.08.29
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.08.29			v1.00			First Write
 */
import java.util.Scanner;

public class intArray_Ex {

    public static int[] get_int_array(Scanner cin, int size) {
        int[] arr = new int[size];
        int num = 0;
        for (int i = 0; i < size; i++) {
            num = cin.nextInt();
            arr[i] = num;
        }
        return arr;
    }

    public static void print_array(int[] array, int size) {

        for (int i=0;i<size;i++)
        {
             System.out.print(array[i]+" ");
        }
        System.out.print("\n");
    }

    public static void insertion_sort(int[] array, int size) {
        int temp, i, j;
        for (i = 1; i <= (size-1); i++)
        {
            temp = array[i];
            for (j = i; j > 0 && array[j - 1] >= temp; j--)
            {
                array[j] = array[j-1]; // shift right to make a room
            }
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);   // gen Scanner object
        System.out.print("Please input number of integers to process : ");
        int num_data = cin.nextInt();           // get size
        int[] int_array;
        System.out.print("Please input " + num_data + " integers in a line, separated with space :");
        int_array = get_int_array(cin, num_data);   // get array
        System.out.print("Input data : ");
        print_array(int_array, num_data);
        insertion_sort(int_array, num_data);
        System.out.print("Sorted input data : ");
        print_array(int_array, num_data);
    }
}
