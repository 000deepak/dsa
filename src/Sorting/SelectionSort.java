package Sorting;

/**
 * lowest = first element
 * pass
 * select lowest element
 * swap
 */

public class SelectionSort {
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr) {
        int n = arr.length;

        //n-1 because last iteration is not needed as last element will be automatically sorted
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            //i+1 because we have to leave the current element and start comparing from next
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

    public static final void swap(final int[] arr, final int i, final int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 2, 9, 10};
        SelectionSort ss = new SelectionSort();
        ss.printArray(arr);
        ss.sort(arr);
        ss.printArray(arr);
    }
}
