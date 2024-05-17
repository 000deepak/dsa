package interview;

import java.util.HashMap;

public class SubArrayWithZeroSum {
    public static boolean hasZeroSumSubarray(int[] arr) {
        // Create a HashMap to store the cumulative sum and its corresponding index
        HashMap<Integer, Integer> sumMap = new HashMap<>();

        // Initialize the cumulative sum
        int sum = 0;

        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the cumulative sum
            sum += arr[i];

            // If the cumulative sum is zero, or we have seen this cumulative sum before
            if (sum == 0 || sumMap.containsKey(sum)) {
                return true;
            }

            // Store the cumulative sum with its index in the HashMap
            sumMap.put(sum, i);
        }

        // If we reach here, no subarray with zero sum exists
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        if (hasZeroSumSubarray(arr)) {
            System.out.println("Found a subarray with sum equal to zero.");
        } else {
            System.out.println("No subarray with sum equal to zero found.");
        }
    }
}
