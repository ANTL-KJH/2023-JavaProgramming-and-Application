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
    public static void shuffle_array(int[] array, int size) // random array shuffle
    {
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
    public static void insertion_sort(int[] array, int size)    // inserttion sort
    {
        int temp, in, out;
        for (out = 1; out <= (size - 1); out++) {
            temp = array[out];
            in = out;
            for (; in > 0 && array[in - 1] >= temp; --in) {
                array[in] = array[in - 1];
            }
            array[in] = temp;
        }
    }

    public static void merge_sort(int[] a, int n)
    {
        int[] tmp_arr = new int[a.length];
        _mergeSort(a, tmp_arr,0,n-1);
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

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int big_size;
        int offset = 0;
        int[] bigRandIntArray;
        long t1, t2, elapsed_time_ms;
        while (true) {
            System.out.print("input big_size (> 32767) to compare performances of (merge, insertion) sorting algorithms (0 to terminate) : ");
            big_size = cin.nextInt();
            if (big_size == 0)
                break;

            bigRandIntArray = genBigRandIntArray(big_size, offset); // genBigRandIntArray
            System.out.printf("Before merge_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);

            t1 = System.currentTimeMillis();    // check start time
            merge_sort(bigRandIntArray, big_size);  // merge sorting
            t2 = System.currentTimeMillis();    // check end time
            elapsed_time_ms = t2 - t1;
            System.out.printf("After merge_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);  // print BigArraySample
            System.out.printf("merge_sort() for intArray(size=%d) took %d milliseconds\n", big_size, elapsed_time_ms);

            shuffle_array(bigRandIntArray, big_size);   // shuffle array
            System.out.printf("Before insertion_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);
            t1 = System.currentTimeMillis();    // check start time
            insertion_sort(bigRandIntArray, big_size);  // insertion sorting
            t2 = System.currentTimeMillis();    // check end time
            elapsed_time_ms = t2 - t1;
            System.out.printf("After insertion_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);  // print BigArraySample
            System.out.printf("insertion_sort() for intArray(size=%d) took %d milliseconds\n", big_size, elapsed_time_ms);
        }
    }
}