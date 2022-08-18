package arrays.Basic;

import java.util.Arrays;

public class ArraysEqualCheck {
    public static void main(String[] args) {
        long[] a = {1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10};
        long[] b = {1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10};
        check(a, b, a.length);
    }

    public static boolean check(long A[], long B[], long N) {
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) return false;
        }
        return true;
    }
}
