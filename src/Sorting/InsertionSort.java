package Sorting;

import java.util.Arrays;

/**
 * temp
 * compare
 * shift
 * insert
 *
 * In linkedlist we dont have to shift elements
 * Insetion sort is designed for linked list
 */

//passes = (n-1)
//comparison = 1+2+3+4+5+n-1 = n(n-2)/2 = O(n2)
//swaps      = 1+2+3+4+5+n-1 = n(n-2)/2 = O(n2)

//Time complexity of any sortig algo is based on comparison.
//Time complexity = O(n2)


class InsertionSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int temp = arr[i];
            int j = i - 1;
  
            /* Move elements of arr[0..i-1], that are
               greater than temp, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    // Driver method
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}