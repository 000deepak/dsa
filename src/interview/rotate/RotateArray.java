package interview.rotate;

import java.util.Arrays;

/**
 * Given an array, rotate the array by one position in clock-wise direction.
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * A[] = {1, 2, 3, 4, 5}
 * Output:
 * 5 1 2 3 4
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};
        int end = arr.length -1 ;
        int d = 1;

        for (int i = 1; i <= d; i++) {
            int last = arr[0];
            for (int j = 0; j < end; j++) {
                arr[j] = arr[j + 1];
            }
            arr[end] = last;
        }
        System.out.println("rotated array" + Arrays.toString(arr));//[2, 3, 4, 5, 1]
    }
}
/**
 * Following are steps.
 * 1) Store last element in a variable say x.
 * 2) Shift all elements one position ahead.
 * 3) Replace first element of array with x.
 */