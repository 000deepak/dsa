package Sorting;

import java.util.Arrays;

public class HeapSort {

    /**
     * Heapsort.
     * <p/>
     * Time complexity: O(n log n) as maxHeapify has complexity O(log n), buildMaxHeap has complexity O(n) and we 
     * run maxHeapify n-1 times in heapSort function, therefore time complexity of heapSort function is O(n log n).
     */
    public static void heapSort(int[] a) {
        buildMaxHeap(a);

        for (int i = a.length - 1; i > 0; i--) {
            swap(a, 0, i);
            maxHeapify(a, 0, i);
        }
    }
    public static void maxHeapify(int[] a, int index, int end) {
        int largest = index;
        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;

        if (leftIndex < end && a[index] < a[leftIndex]) {
            largest = leftIndex;
        }
        if (rightIndex < end && a[largest] < a[rightIndex]) {
            largest = rightIndex;
        }

        if (largest != index) {
            swap(a, index, largest);
            maxHeapify(a, largest, end);
        }
    }

    /**
     * Converts array {@param a} in to a max heap.
     * <p/>
     * Time complexity: O(n) and is not O(n log n).
     */
    private static void buildMaxHeap(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            maxHeapify(a, i, a.length);
        }
    }

    private static void swap(int[] a, int firstIndex, int secondIndex) {
        a[firstIndex] = a[firstIndex] + a[secondIndex];
        a[secondIndex] = a[firstIndex] - a[secondIndex];
        a[firstIndex] = a[firstIndex] - a[secondIndex];
    }

    public static void main(String[] args) {
        int[] ar = new int[]{2, 5, 1, 7, 9, 4};
        System.out.println(Arrays.toString(ar));
        heapSort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
