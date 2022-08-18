package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] a, int n) {
        if (n < 2) return a;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        return merge(a, l, r, mid, n - mid);
    }

    public static int[] merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        //merging l&r into a
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }

        //copy remaining elements of array if they are of unequal length
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }

        return a;
    }

    public static void main(String[] args) {
        int[] actual = {5, 1, 6, 2, 3, 4};
        int[] sorted = MergeSort.mergeSort(actual, actual.length);

        System.out.println(Arrays.toString(sorted));
    }
}