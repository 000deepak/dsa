package smartInterviewsBasic107.array;

//Merge Two Sorted Arrays
//You are given two sorted integer arrays A and B of size N and M respectively. Print the entire data in sorted order.
//
//
//
//Input Format
//
//First line of input contains N - the size of the array. The second line contains N integers - the elements of the first array. The third line contains M - the size of the second array. The fourth line contains M integers - the elements of the second array.
//
//
//
//Output Format
//
//For each test case, print the entire data in sorted order with each element separated by a space, on a new line.
//
//
//
//Constraints
//
//1 <= N <= 103
//
//1 <= M <= 103
//
//-105 <= A[i], B[i] <= 105
//
//
//
//Example
//
//Input
//
//7
//
//1 1 5 8 10 12 15
//
//5
//
//-1 2 4 5 7
//
//
//
//Output
//
//-1 1 1 2 4 5 5 7 8 10 12 15
//
//
//
//Explanation
//
//
//
//Self Explanatory
public class MergeTwoSortedArrays {
  public static int[] mergeSortedArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] result = new int[n + m]; // Array to store merged results
        int i = 0, j = 0, k = 0;

        // Merge the arrays
        while (i < n && j < m) {
            if (A[i] < B[j]) {
                result[k++] = A[i++];
            } else {
                result[k++] = B[j++];
            }
        }

        // Add remaining elements of A
        while (i < n) {
            result[k++] = A[i++];
        }

        // Add remaining elements of B
        while (j < m) {
            result[k++] = B[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7}; // Example array A
        int[] B = {2, 4, 6, 8, 10}; // Example array B

        int[] mergedArray = mergeSortedArrays(A, B);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
