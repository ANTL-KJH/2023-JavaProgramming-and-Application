/*
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
        /* shuffle */
        for (int i = 0; i < size; i++) {
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
        if (count < (size - per_line * sample_lines))
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
    public static void shuffle_array(int[] array, int size) {
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

    /*public static void merge_sort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        merge_sort(l, mid);
        merge_sort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }*/
    public static void merge_sort(int[] a, int n) {
        int[] tmp_arr = new int[a.length];

        _mergeSort(a, tmp_arr,0,n-1);

    }
    public static void _mergeSort(int[] arr, int[] tmp_arr, int left, int right)
    {
        if(left>=right)
            return;
        int i,j,k,mid=(left+right)/2;
        _mergeSort(arr,tmp_arr,left,mid);
        _mergeSort(arr, tmp_arr,mid+1,right);
        for(i = mid;i>=left;i--)
            tmp_arr[i]=arr[i];
        for (j = 1; j<=right-mid;j++)
            tmp_arr[right-j+1] =arr[j+mid];
        for(i=left,j=right,k=left;k<=right;k++)
        {
            if(tmp_arr[i]<tmp_arr[j])
                arr[k]= tmp_arr[i++];
            else
                arr[k] = tmp_arr[j--];
        }
    }


    public static void main(String[] args) {
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
            bigRandIntArray = genBigRandIntArray(big_size, offset);
            System.out.printf("Before merge_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);
            t1 = System.currentTimeMillis();
            merge_sort(bigRandIntArray, big_size);
            t2 = System.currentTimeMillis();
            elapsed_time_ms = t2 - t1;
            System.out.printf("After merge_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);
            System.out.printf("merge_sort() for intArray(size=%d) took %d milliseconds\n", big_size, elapsed_time_ms);
            shuffle_array(bigRandIntArray, big_size);
            System.out.printf("Before insertion_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);
            t1 = System.currentTimeMillis();
            insertion_sort(bigRandIntArray, big_size);
            t2 = System.currentTimeMillis();
            elapsed_time_ms = t2 - t1;
            System.out.printf("After insertion_sorting, size = %d, offset = %d\n", big_size, offset);
            printBigArraySample(bigRandIntArray, big_size, 10, 2);
            System.out.printf("insertion_sort() for intArray(size=%d) took %d milliseconds\n", big_size, elapsed_time_ms);

        } // end while
    }
}
