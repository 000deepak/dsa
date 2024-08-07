package Sorting;

import java.util.Arrays;

/*
* The time complexity of Merge Sort in the worst case, best case, and average case is: O(nlogn)
* STRATEGY -
* Divide: The array is divided into two halves.
* Conquer: Each half is sorted recursively.
* Combine: The two sorted halves are merged to form a sorted array.
*
* */
public class MergeSort {

    // Main method to sort an array using merge sort
    public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        mergeSort(array, 0, array.length - 1);
    }

    // Helper method to perform merge sort recursively
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Recursively sort the left half
            mergeSort(array, left, middle);

            // Recursively sort the right half
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    // Method to merge two sorted halves of the array
    private static void merge(int[] array, int left, int middle, int right) {
        // Sizes of the two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Temporary arrays to hold the subarrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[middle + 1 + j];
        }

        // Merge the temporary arrays

        // Initial indexes of the first and second subarrays
        int i = 0, j = 0;

        // Initial index of the merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Utility method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test the merge sort
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array");
        printArray(array);

        sort(array);

        System.out.println("\nSorted array");
        printArray(array);
    }
}
