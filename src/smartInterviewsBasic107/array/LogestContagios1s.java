package smartInterviewsBasic107.array;

//Longest Contiguous 1's
//Given an array of elements containing 0's and 1's. You have to find the length of longest contiguous 1's.
//
//
//
//Input Format
//
//First line of input contains N - size of the array. The next line contains the N integers of array A.
//
//
//
//Output Format
//
//Print the length of longest contiguous 1's.
//
//
//
//Constraints
//
//1 <= N <= 1000
//
//
//
//Example
//
//Input
//
//10
//
//1 0 0 1 0 1 1 1 1 0
//
//
//
//Output
//
//4
//
//
//
//Explanation
//
//
//
//Self Explanatory
public class LogestContagios1s {
      public static int findLongestOnes(int[] arr) {
        int maxLength = 0; // To store the maximum length of contiguous 1's
        int currentLength = 0; // To store the current length of contiguous 1's

        for (int num : arr) {
            if (num == 1) {
                currentLength++; // Increment the current length for each 1
                maxLength = Math.max(maxLength, currentLength); // Update the maximum length
            } else {
                currentLength = 0; // Reset current length if 0 is encountered
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1}; // Example input
        System.out.println("The longest contiguous 1's are of length: " + findLongestOnes(arr));
    }
}
