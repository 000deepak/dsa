package arrays.ABC;

import java.util.Arrays;
import java.util.Collections;

public class Reverse2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 6};
        reverse1(a);
        reverse2(a);
        reverse3(a);
        reverse4(a);

    }

    //temp array
    public static void reverse1(int a[]) {
        int n = a.length;
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j--;
        }

        System.out.println(Arrays.toString(b));
    }

    //swap
    public static void reverse2(int a[]) {
        int n = a.length;
        int i, t;
        for (i = 0; i < n / 2; i++) {
            //storing 1st element
            t = a[i];

            //assigning other
            a[i] = a[n - i - 1];

            //storing last
            a[n - i - 1] = t;
        }

        System.out.println(Arrays.toString(a));
    }

    //collections
    public static void reverse4(int a[]) {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.toString(a));
    }

    //string builder
    public static void reverse3(int a[]) {
        String[] arr = {"Hello", "World"};
        StringBuilder reversed = new StringBuilder();

        for (int i = arr.length; i > 0; i--) {
            reversed.append(arr[i - 1]).append(" ");
        }
        String[] reversedArray = reversed.toString().split(" ");
        System.out.println(Arrays.toString(reversedArray));
    }
}
