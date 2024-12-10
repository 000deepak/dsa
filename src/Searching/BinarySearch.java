package Searching;

/**
 * Works Only For Sorted Arrays
 * Time Complexity : O(log n)
 */
public class BinarySearchForArraySortedInAscendingOrder {
    public int binarySearch(int[] arr, int key) {

        //1.find 1st and last index
        int start = 0;
        int end = arr.length - 1;

        //to loop from o to n-1 all elements
        while (start <= end) {

            //2.find mid
            int mid = (start + end) / 2;

            //3.mid-key equality
            if (arr[mid] == key) {
                return mid;
            }

            //4.where to find
            //go left
            if (key < arr[mid]) {
                end = mid - 1;
            }

            //go right
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int BinarySearchForArraySortedInDescendingOrder(int[] arr, int key) {
        //1. Find the first and last index
        int start = 0;
        int end = arr.length - 1;

        // To loop from 0 to n-1 for all elements
        while (start <= end) {

            //2. Find the mid index
            int mid = (start + end) / 2;

            //3. Check if mid element is equal to the key
            if (arr[mid] == key) {
                return mid;
            }

            /*ONLY CHANGE FOR DESCENDING IS CHANGE < TO >*/
            //4. Where to search
            // In a descending array, if key is greater than arr[mid], go left
            if (key > arr[mid]) {
                end = mid - 1;  // Move to the left side
            }

            // If key is less than arr[mid], go right
            else {
                start = mid + 1;  // Move to the right side
            }
        }
        return -1;  // Return -1 if the element is not found
    }

    static void binarySearchOrderAgnostic(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] <= arr[end]) {
            BinarySearchForArraySortedInAscendingOrder(arr, target);
        } else {
            BinarySearchForArraySortedInDescendingOrder(arr, target);
        }
    }
    

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1, 10, 20, 47, 59, 65, 75, 88, 99};
        System.out.println(bs.binarySearch(arr, 65));
    }
}
