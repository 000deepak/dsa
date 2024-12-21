//public class BinarySearch {
//
//    // Method to find the floor of a number
//    public int findFloor(int[] arr, int key) {
//        int start = 0;
//        int end = arr.length - 1;
//        int floor = -1; // Initialize floor as -1 (indicating no floor found)
//
//        // Perform binary search
//        while (start <= end) {
//            int mid = (start + end) / 2;
//
//            // If key is found, return it as both floor and ceil
//            if (arr[mid] == key) {
//                return arr[mid];
//            }
//
//            // If key is smaller, search the left part and update floor
//            if (key < arr[mid]) {
//                end = mid - 1;
//            } else {
//                floor = arr[mid];  // Update floor as arr[mid] is less than key
//                start = mid + 1;
//            }
//        }
//
//        // Return floor
//        return floor;
//    }
//
//    // Method to find the ceil of a number
//    public int findCeil(int[] arr, int key) {
//        int start = 0;
//        int end = arr.length - 1;
//        int ceil = -1; // Initialize ceil as -1 (indicating no ceil found)
//
//        // Perform binary search
//        while (start <= end) {
//            int mid = (start + end) / 2;
//
//            // If key is found, return it as both floor and ceil
//            if (arr[mid] == key) {
//                return arr[mid];
//            }
//
//            // If key is smaller, search the left part
//            if (key < arr[mid]) {
//                ceil = arr[mid];  // Update ceil as arr[mid] is greater than key
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//
//        // Return ceil
//        return ceil;
//    }
//
//    public static void main(String[] args) {
//        BinarySearch bs = new BinarySearch();
//        int[] arr = {1, 2, 8, 10, 10, 12, 19};
//        int key = 5;
//
//        // Get floor and ceil for the given key
//        int floor = bs.findFloor(arr, key);
//        int ceil = bs.findCeil(arr, key);
//
//        System.out.println("Floor: " + floor);  // Largest number <= key
//        System.out.println("Ceil: " + ceil);   // Smallest number >= key
//    }
//}
