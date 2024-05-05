package arrays.Basic;

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
        int[] arr = {1, 2, 3, 4, 5};

        rotate(arr, arr.length);
    }

    public static void rotate(int arr[], int n) {
        int temp = arr[n - 1];

        for (int i = 1; i < n; i++) {
            int j = i + 1;
            arr[n - i] = arr[n - j];
        }
        arr[0] = temp;
    }
}
/**
 * Following are steps.
 * 1) Store last element in a variable say x.
 * 2) Shift all elements one position ahead.
 * 3) Replace first element of array with x.
 */