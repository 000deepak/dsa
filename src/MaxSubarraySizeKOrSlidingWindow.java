public class MaxSubarraySizeKOrSlidingWindow {
    public static int maxSubarraySum(int[] arr, int k, int n) {
        if (n < k) {
            throw new IllegalArgumentException("Array size must be greater than or equal to k");
        }

        int maxSum = 0;
        int windowSum = 0;

        // Initialize the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window
        // [9 6 4 3 2 1]
        //  0 1 2 3 4 5
        // k = 3 then {012, 123, 234} k(3) can go upto 4th posn only
        // that is N(6) - k(3) + 1 = 4
        for (int i = 1; i < n - k + 1; i++) {
            int preElement = arr[i - 1];
            int nextElement = arr[i + k - 1];
            windowSum = windowSum - preElement + nextElement;
            // Update maxSum if the new windowSum is greater
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of a subarray of size " + k + ": " + maxSubarraySum(arr, k));

        int[] arr2 = {1, 9, -1, 3, -2, 3, 5};
        System.out.println("Maximum sum of a subarray of size " + k + ": " + maxSubarraySum(arr2, k));
    }
}

