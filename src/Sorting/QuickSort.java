package Sorting;

import java.util.Arrays;

public class QuickSort {

    /**
     * pivot
     * compare
     * swap
     */

    public static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = endIndex, temp;

        for (int i = startIndex; i < endIndex; i++) {
            // if ith element is smaller than pivot element then swap it with the last larger element known
            if (arr[i] < arr[pivot]) {
                // swap a[startIndex] with a[i]
                temp = arr[startIndex];
                arr[startIndex] = arr[i];
                arr[i] = temp;
                startIndex++;
            }
        }

        // place the pivot element in its correct position
        temp = arr[startIndex];
        arr[startIndex] = arr[pivot];
        arr[pivot] = temp;

        return startIndex;
    }

    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int partition = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, partition - 1);
            quickSort(arr, partition + 1, endIndex);
        }
    }


    public static void main(String[] args) {
        int[] ar = {3, 2, 1, 6, 4, 9, 7, 8};
        System.out.println(Arrays.toString(ar));
        quickSort(ar, 0, ar.length - 1);
        System.out.println(Arrays.toString(ar));
    }
}
