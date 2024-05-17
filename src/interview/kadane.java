package interview;

/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
*/
public class kadane {
    public static void main(String[] args) {
        int[] arr = {9, 10, -3, 4, -1, 2, 1, -5, -22};
        int n = arr.length;

        long max = 0; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            max=Math.max(max, sum);

            // If sum < 0: discard the sum calculated
            if (sum < 0) sum = 0;

        }
        System.out.println("The maximum subarray sum is: " + max);
    }
}
