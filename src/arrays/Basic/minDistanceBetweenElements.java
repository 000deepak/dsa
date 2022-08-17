package arrays.Basic;

/**
 * You are given an array A, of N elements. Find minimum index based distance between two elements of the array, x and y.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4
 * A[] = {1,2,3,2}
 * x = 1, y = 2
 * Output: 1
 * Explanation: x = 1 and y = 2. There are
 * two distances between x and y, which are
 * 1 and 3 out of which the least is 1.
 * Example 2:
 * <p>
 * Input:
 * N = 7
 * A[] = {86,39,90,67,84,66,62}
 * x = 42, y = 12
 * Output: -1
 * Explanation: x = 42 and y = 12. We return
 * -1 as x and y don't exist in the array.
 */

public class minDistanceBetweenElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(minDist(arr, arr.length, 8, 5));
    }

    static int minDist(int a[], int n, int x, int y) {
        int minDist = 0;
        int checkDist = 0;
        int[] xi = new int[n];
        int[] yj = new int[n];
        // code here
        for (int i = 0; i < n; i++) {
            if (x == a[i]) {
                xi[i] = i;
                for (int j = 0; j < n; j++) {
                    if (y == a[j]) {
                        yj[j] = j;

                        if (minDist == 0) minDist = yj[j] - xi[i];
                        checkDist = yj[j] - xi[i];
                        if (checkDist < minDist) return Math.abs(checkDist);
                        else return Math.abs(minDist);
                    }
                }
            }
        }
        return -1;
    }
}
