package HW02_1_BigRandArray_QuickSort;

import java.util.Scanner;

public class BigRandArray_QuickSort_Ex {
    public static int[] genBigRandIntArray(int size, int offset)
    {

    }
    public static void printBigArraySample(int[] bigArray,int size,int per_line,int sample_lines)
    {

    }
    public static int _partition(int[] array, int size, int left,int right,int pivotIndex)
    {

    }
    public static void _quickSort(int[] array, int size, int left, int right)
    {

    }
    public static void quickSort(int[] array, int size)
    {
        _quickSort(array, size, 0, size-1)
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int big_size;
        int offset = 0;
        int[] bigRandIntArray;
        while (true) {
            System.out.print("input big_size (> 32767) to generate non-duplicated random big integer array (0 to terminate) : ");
            big_size = cin.nextInt();
            if (big_size == 0)
                break;
            bigRandIntArray = genBigRandIntArray(big_size, offset);
            System.out.printf("Before sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);
            quickSort(bigRandIntArray, big_size);
            System.out.printf("After sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);
        }
    }
}
