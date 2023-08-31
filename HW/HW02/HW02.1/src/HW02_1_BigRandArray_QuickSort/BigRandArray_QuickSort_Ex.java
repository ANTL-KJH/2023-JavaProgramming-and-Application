/*
 * Project Name : JavaProgramming and Application HW02.1
 * Program's purpose and basic function :
 * - BigRandArray
 * Program First Author : JH KIM
 * Date of First Write : 2023.08.31
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.08.31			v1.00			First Write
 */
package HW02_1_BigRandArray_QuickSort;

import java.util.Scanner;

public class BigRandArray_QuickSort_Ex {
    public static int[] genBigRandIntArray(int size, int offset)    // genBigRandIntArray, shuffle 방식
    {
        int[] bigIntArray = new int[size];
        int j, temp;
        for(int i=0; i<size; i++)
            bigIntArray[i] = i + offset;
        /* shuffle */
        for(int i=0; i<size; i++) {
            j = (int) (Math.random() * size);   // Math.random()은 0.0~1.0 사이의 소수를 랜덤하게 생성, 생성 후 int형으로 변환
            if (j == i)
                continue;
            temp = bigIntArray[i];
            bigIntArray[i] = bigIntArray[j];
            bigIntArray[j] = temp;
        }
        return bigIntArray;
    }
    public static void printBigArraySample(int[] bigArray,int size,int per_line,int sample_lines)   // printBigArraySample
    {
        int count = 0;
        for (int i=0; i<sample_lines; i++)
        {
            for (int j = 0; j < per_line; j++)
            {
                if (count > size)   // if count exceeds the size, then return
                {
                    System.out.print("\n");
                    return;
                }
                System.out.printf("%8d ", bigArray[count]);
                count++;
            }
            System.out.print("\n");
        }
        if (count < (size - per_line * sample_lines))
            count = size - per_line * sample_lines;
        System.out.print("\n . . . . . \n");
        for (int i = 0; i < sample_lines; i++)
        {
            for (int j = 0; j< per_line; j++)
            {
                if (count > size)   // if count exceeds the size, then return
                {
                    System.out.print("\n");
                    return;
                }
                System.out.printf("%8d ", bigArray[count]);
                count++;
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public static int _partition(int[] array, int size, int left,int right,int pivotIndex)
    {
        int pivotValue;
        int newPI;
        int temp, i;

        pivotValue = array[pivotIndex];

        // swap pivot index with end index
        temp = array[pivotIndex];
        array[pivotIndex] = array[right];
        array[right] = temp;

        newPI = left;
        for (i = left; i <= (right - 1); i++)
        {
            if (array[i] <= pivotValue) // swap
            {
                temp = array[i];
                array[i] = array[newPI];
                array[newPI] = temp;
                newPI = newPI + 1;
            }
        }
        // swap pivot index with end
        temp = array[newPI];
        array[newPI] = array[right];
        array[right] = temp;
        return newPI;
    }
    public static void _quickSort(int[] array, int size, int left, int right)
    {
        int pI, newPI; // pivot index
        if (left >= right)
        {
            return;
        }
        pI = (left + right) / 2;    // pivot Index
        newPI = _partition(array, size, left, right, pI);
        if (left < (newPI - 1))     // partition left side
        {
            _quickSort(array, size, left, newPI - 1);
        }
        if ((newPI + 1) < right)    // partition right side
        {
        _quickSort(array, size, newPI + 1, right);
        }
    }
    public static void quickSort(int[] array, int size)
    {
        _quickSort(array, size, 0, size-1);
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
            bigRandIntArray = genBigRandIntArray(big_size, offset); // genBigRandArray
            System.out.printf("Before sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);
            quickSort(bigRandIntArray, big_size);
            System.out.printf("After sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);
        }
    }
}
