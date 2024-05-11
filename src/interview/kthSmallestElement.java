package interview;

import java.util.Arrays;


/*
arr[] = 7 10 4 3 20 15
k = 3
*/
public class kthSmallestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
