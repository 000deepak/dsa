package interview.duplicate;

import java.util.*;

public class PrintDuplicates {
    //1. Using hashset
    public static void findDuplicatesUsingHashSet(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {

            /*
            * if (!seen.add(num))
            * The add method of the HashSet returns true if the element was successfully added to the set
            * i.e., the element was not already present in the set.
            * If the element num is already present in the seen set, the add method returns false.
            * */
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates: " + duplicates);
    }

    //2. Using a HashMap
    public static void findDuplicatesUsingHashMap(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    //3. Using Sorting
    public static void findDuplicatesUsingSorting(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
