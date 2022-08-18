package arrays;

public class findMaxFromArray {
    public static void main(String[] args) {
        int[] a = {1, 20, 2, 3, 4, 5, 6};
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        System.out.println(max);
    }
}
