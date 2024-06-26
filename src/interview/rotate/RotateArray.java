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
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int rotationSteps = 1;

        //clockwise
        //left rotation
        clockwise(arr1,rotationSteps);

        //anti-clockwise
        //right rotation
        antiClockwise(arr2,rotationSteps);
    }

    public static void clockwise(int[] arr, int rotationSteps) {
        int start = 0;
        int end = arr.length - 1;

        for (int i = start; i < rotationSteps; i++) {
            int temp = arr[0];
            for (int j = start; j < end; j++) {
                arr[j] = arr[j + 1];
            }
            arr[end] = temp;
        }
        System.out.println("clockwise rotated array" + Arrays.toString(arr));
        //clockwise rotated array[2, 3, 4, 5, 1]
    }

    public static void antiClockwise(int[] arr, int rotationSteps) {
        int start = 0;
        int end = arr.length - 1;

        for (int i = start; i < rotationSteps; i++) {
            int temp = arr[end];
            for (int j = end; j > start; j--) {
                arr[j] = arr[j - 1];
            }
            arr[start] = temp;
        }
        System.out.println("anit-clockwise rotated array" + Arrays.toString(arr));
        //anit-clockwise rotated array[5, 1, 2, 3, 4]
    }
}