package Sorting;

import java.util.Arrays;

public class BubbleSort {

    /**
     * compare
     * swap
     * <p>
     * If u perform 1 pass u will get largest element
     * If u perform 2 pass u will get 2 largest element
     */

    //passes = (n-1)
    //comparison = 1+2+3+4+5+n-1 = n(n-2)/2 = O(n2)
    //swaps      = 1+2+3+4+5+n-1 = n(n-2)/2 = O(n2)

    //Time complexity of any sorting algo is based on comparison.
    //Best= O(n)(already sorted)
    //Avg= O(n2)
    //Worst= O(n2)
    private static void bubbleSort(int[] ar) {
        int start = 0;
        int end = ar.length - 1;

        //using 1st for-loop to calculate end in second for-loop
        for (int i = start; i < end; i++) {
            //j will start from 0 and keep on increasing
            //end will keep on decresing
            for (int j = start; j < end - i; j++) {
                if (ar[j] > ar[j + 1]) {
                    swap(ar, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    public static void main(String[] args) {
        int[] ar = {2, 5, 1, 7, 8};
        System.out.println(Arrays.toString(ar));
        bubbleSort(ar);
        System.out.println(Arrays.toString(ar));
        ar = new int[]{7, 5, 1, 7, 8, 0, 23};
        System.out.println(Arrays.toString(ar));
        bubbleSort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
