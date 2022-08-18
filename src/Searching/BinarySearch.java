package Searching;

/**
 * Time Complexity : O(log n)
 */
public class BinarySearch {
    public int binarySearch(int[] nums, int key) {

        //1.find 1st and last index
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            //2.find mid
            int mid = (high + low) / 2;

            //3.mid-key equality
            if (nums[mid] == key) {
                return mid;
            }

            /**4.where to find*/
            //go right
            if (key < nums[mid]) {
                high = mid - 1;
            }

            //go left
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {1, 10, 20, 47, 59, 65, 75, 88, 99};
        System.out.println(bs.binarySearch(nums, 65));
    }
}
