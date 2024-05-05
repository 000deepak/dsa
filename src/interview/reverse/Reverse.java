package interview.reverse;

import java.util.Arrays;

/**
 * Solution Steps
 * Swap arr[start] and arr[end]
 * Increment start and decrement end
 * If start reached to the value length/2 or start ≥ end, then terminate otherwise repeat from step 2.
 */
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    //swapping method
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            //------------------
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            //------------------
            start ++;
            end --;
        }
    }
}
