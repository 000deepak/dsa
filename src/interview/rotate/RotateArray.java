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
        int[] arr = {1, 2, 3, 4, 5, 7, 8};

        // Method 1
        int rotateSteps = 2;
        int k = rotateSteps % arr.length -1;
        System.out.println("k is " + k);
        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < k; i++) {
            // Perform one step of rotation by reversing the array
            reverse(arr, start, end);
            end--; // Decrease the end index
        }
        System.out.println("method 1 : " + Arrays.toString(arr));


        //method 2
        int[] ar = {1, 2, 3, 4, 5};
        int n = ar.length;

        int temp = ar[n - 1];
        for (int i = 1; i < n; i++) {
            int j = i + 1;
            ar[n - i] = ar[n - j];
        }
        ar[0] = temp;
        System.out.println("method 2 " + Arrays.toString(ar));
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
/**
 * Following are steps.
 * 1) Store last element in a variable say x.
 * 2) Shift all elements one position ahead.
 * 3) Replace first element of array with x.
 */