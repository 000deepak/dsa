package Searching;

/**
 * Works Only For Sorted Arrays
 * Time Complexity : O(log n)
 */
public class BinarySearch {
    public int binarySearch(int[] arr, int key) {

        //1.find 1st and last index
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            //2.find mid
            int mid = (end + start) / 2;

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

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1, 10, 20, 47, 59, 65, 75, 88, 99};
        System.out.println(bs.binarySearch(arr, 65));
    }
}
