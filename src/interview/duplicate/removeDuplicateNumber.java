package interview.duplicate;

import java.util.Arrays;

public class removeDuplicateNumber {
    public static int removeduplicates(int a[], int n) {
        // if(array size if 0 or 1 array is already sorted)
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for storing the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        //for last element
        temp[j++] = a[n - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }

    public static void main(String[] args) {
        int a[] = {1, 1, 2, 2, 2};
        int n = a.length;

        //sort the arrays
        Arrays.sort(a);

        //remove duplicates
        n = removeduplicates(a, n);

        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
