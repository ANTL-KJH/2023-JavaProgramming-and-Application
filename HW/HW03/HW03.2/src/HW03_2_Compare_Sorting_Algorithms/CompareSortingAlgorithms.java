/**
 * Project Name : JavaProgramming and Application HW03.2
 * Program's purpose and basic function :
 * - Sorting algorithms compare(mergeSort, insertionSort)
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.04
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.04			v1.00			First Write
 * JH KIM               2023.09.12          v1.10           Add quick sorting, selection sorting
 */
package HW03_2_Compare_Sorting_Algorithms;

import java.util.Scanner;

public class CompareSortingAlgorithms {
    public static int[] genBigRandIntArray(int size, int offset) {
        int[] bigIntArray = new int[size];
        int j, temp;
        for (int i = 0; i < size; i++)
            bigIntArray[i] = i + offset;
        for (int i = 0; i < size; i++)  // random shuffle
        {
            j = (int) (Math.random() * size);
            if (j == i)
                continue;
            temp = bigIntArray[i];
            bigIntArray[i] = bigIntArray[j];
            bigIntArray[j] = temp;
        }
        return bigIntArray;
    }

    public static void printBigArraySample(int[] bigArray, int size, int per_line, int sample_lines) {
        int last_block_start;
        int count = 0;
        for (int i = 0; i < sample_lines; i++) {
            for (int j = 0; j < per_line; j++) {
                if (count > size) {
                    System.out.print("\n");
                    return;
                }
                System.out.printf("%8d ", bigArray[count]);
                count++;
            }
            System.out.print("\n");
        }
        if (count < (size - per_line * sample_lines))   // sample 출력 개수에 따른 count 조절
            count = size - per_line * sample_lines;
        System.out.print("\n . . . . . \n");
        for (int i = 0; i < sample_lines; i++) {
            for (int j = 0; j < per_line; j++) {
                if (count > size) {
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
    public static void shuffle_array(int[] array) // random array shuffle
    {
         int size = array.length;
        int j, temp;
        for(int i=0; i<size; i++) {
            j = (int) (Math.random() * size);
            if (j == i)
                continue;
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    public static void insertion_sort(int[] array) {
        /* sort given array with insertion_sort algorithm */
        int temp, in, out, size = array.length;
        for (out=1; out <= (size-1); out++) {
            temp = array[out];
            in = out;
            for (; in > 0 && array[in-1] >= temp; --in) {
                array[in] = array[in-1]; // shift right to make a room
            }
            array[in] = temp;
        }
    }

    public static void merge_sort(int[] a)
    {
        int size = a.length;
        int[] tmp_arr = new int[a.length];
        _mergeSort(a, tmp_arr,0,size-1);
    }
    public static void _mergeSort(int[] arr, int[] tmp_arr, int left, int right)    // merge sort inner func
    {
        if(left>=right)
            return;
        int i,j,k,mid=(left+right)/2;
        _mergeSort(arr,tmp_arr,left,mid);
        _mergeSort(arr, tmp_arr,mid+1,right);

        // copy original array  to temp array
        for(i = mid;i>=left;i--)
            tmp_arr[i]=arr[i];
        for (j = 1; j<=right-mid;j++)
            tmp_arr[right-j+1] =arr[j+mid];

        // merge
        for(i=left,j=right,k=left;k<=right;k++)
        {
            if(tmp_arr[i]<tmp_arr[j])
                arr[k]= tmp_arr[i++];
            else
                arr[k] = tmp_arr[j--];
        }
    }
    public static void selection_sort(int[] array)
    {
        /* sort given array with selection_sort algorithm */
        int temp, min_idx, size = array.length;
        for (int i=0; i<size-1; i++)
        {
            min_idx = i;
            for (int j=i+1; j<size; j++)
            {
                if (array[min_idx] > array[j])
                {
                    min_idx = j;
                }
            }
            if (min_idx != i)
            {
                temp = array[i];
                array[i] = array[min_idx];
                array[min_idx] = temp;
            }
        }
    }
    public static int _partition(int[] array, int left,int right,int pivotIndex)
    {
        int size = array.length;
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
    public static void _quickSort(int[] array, int left, int right)
    {
        int size = array.length;
        int pI, newPI; // pivot index
        if (left >= right)
        {
            return;
        }
        pI = (left + right) / 2;    // pivot Index
        newPI = _partition(array, left, right, pI);
        if (left < (newPI - 1))     // partition left side
        {
            _quickSort(array, left, newPI - 1);
        }
        if ((newPI + 1) < right)    // partition right side
        {
            _quickSort(array, newPI + 1, right);
        }
    }
    public static void quick_sort(int[] array)
    {
        int size = array.length;
        _quickSort(array, 0, size-1);
    }
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int big_size;
        int offset = 0;
        int[] bigRandIntArray;
        long t1, t2, elapsed_time_ms;
        while (true) {
            System.out.print("input big_size (> 32767) to compare performances of (quick, merge, insertion, selection) sorting algorithms (0 to terminate) : ");
            big_size = cin.nextInt();
            if (big_size == 0)
                break;

            bigRandIntArray = genBigRandIntArray(big_size, offset); // genBigRandIntArray
            System.out.printf("Before quick_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);
            t1 = System.currentTimeMillis();    // check start time
            quick_sort(bigRandIntArray);  // quick sorting
            t2 = System.currentTimeMillis();    // check end time
            elapsed_time_ms = t2 - t1;
            System.out.printf("After quick_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);  // print BigArraySample
            System.out.printf("quick_sort() for intArray(size=%d) took %d milliseconds\n", big_size, elapsed_time_ms);

            // merge sorting
            shuffle_array(bigRandIntArray);   // shuffle array
            System.out.printf("Before merge_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);
            t1 = System.currentTimeMillis();    // check start time
            merge_sort(bigRandIntArray);  // merge sorting
            t2 = System.currentTimeMillis();    // check end time
            elapsed_time_ms = t2 - t1;
            System.out.printf("After merge_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);  // print BigArraySample
            System.out.printf("merge_sort() for intArray(size=%d) took %d milliseconds\n", big_size, elapsed_time_ms);

            // insertion sorting
            shuffle_array(bigRandIntArray);   // shuffle array
            System.out.printf("Before insertion_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);
            t1 = System.currentTimeMillis();    // check start time
            insertion_sort(bigRandIntArray);  // insertion sorting
            t2 = System.currentTimeMillis();    // check end time
            elapsed_time_ms = t2 - t1;
            System.out.printf("After insertion_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);  // print BigArraySample
            System.out.printf("insertion_sort() for intArray(size=%d) took %d milliseconds\n", big_size, elapsed_time_ms);

            // selection sorting
            shuffle_array(bigRandIntArray);   // shuffle array
            System.out.printf("Before selection_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);
            t1 = System.currentTimeMillis();    // check start time
            selection_sort(bigRandIntArray);  // selection sorting
            t2 = System.currentTimeMillis();    // check end time
            elapsed_time_ms = t2 - t1;
            System.out.printf("After selection_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);  // print BigArraySample
            System.out.printf("selection_sort() for intArray(size=%d) took %d milliseconds\n", big_size, elapsed_time_ms);

        }
    }
}