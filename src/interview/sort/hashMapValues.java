package interview.sort;

import java.util.*;

public class hashMapValues {
    public static void main(String[] args) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        frequencyMap.put('h', 1);
        frequencyMap.put('e', 5);
        frequencyMap.put('l', 3);
        frequencyMap.put('o', 2);
        frequencyMap.put('w', 63);
        frequencyMap.put('r', 1);
        frequencyMap.put('d', 10);

        // Convert HashMap to List of Map.Entry objects
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        // Sort the list based on values using a custom Comparator
        Collections.sort(entryList, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                // Compare the values of the Map.Entry objects
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Create a new LinkedHashMap to preserve the insertion order
        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted map
        System.out.println("Sorted HashMap by values:");
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
