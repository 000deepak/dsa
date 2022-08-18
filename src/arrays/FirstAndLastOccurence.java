package arrays;

import java.util.ArrayList;

/**
 * Given a sorted array arr containing n elements with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given array.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n=9, x=5
 * arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
 * Output:  2 5
 * Explanation: First occurrence of 5 is at index 2 and last
 * occurrence of 5 is at index 5.
 */

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10};
        firstAndLastOccurence(arr, 29, 1);

    }

    public static ArrayList<Long> firstAndLastOccurence(int arr[], int n, int x) {
        ArrayList<Long> l = new ArrayList<>();

        long first = 0;
        long last = 0;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                if (i == 0) {
                    flag = true;

                } else {
                    if (flag) last = i;
                    else {
                        if (first == 0) first = i;
                        else last = i;
                    }
                }
            }
        }

        if (first != 0 && last == 0) last = first;
        l.add(first);
        l.add(last);
        return l;
    }
}
