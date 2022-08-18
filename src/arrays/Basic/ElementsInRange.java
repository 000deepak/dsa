package arrays.Basic;

public class ElementsInRange {
    public static void main(String[] args) {

    }
    public static boolean check_elements(int arr[], int n, int A, int B) {
        int m = 0;
        int small;
        if (A > B) {
            m = A - B - 1;
            small = A;
        } else {
            m = B - A - 1;
            small = A;
        }

        int[] a = new int[m];

        for (int i = 0; i < small; i++) {
            a[i] = ++A;
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j= 0; j < n; j++) {
                if (a[i] == arr[j]) count++;
            }
        }

        if (count == a.length) return true;
        else return false;
    }
}
