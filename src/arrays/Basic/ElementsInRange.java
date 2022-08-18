package arrays.Basic;

public class ElementsInRange {
    public static void main(String[] args) {

    }

    public static boolean check_elements(int arr[], int n, int A, int B) {
        for (int i = A; i <= B; i++) {
            if (!(search(i, arr))) return false;
        }
        return true;
    }

    static boolean search(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) return true;
        }
        return false;
    }
}

