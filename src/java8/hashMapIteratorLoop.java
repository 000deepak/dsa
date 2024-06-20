package java8;

import java.util.*;

public class hashMapIteratorLoop {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1000);
        map.put("two", 2000);

        //print sum of values of hashmpa
        int sum = map.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum + " Sum");

        //get keys
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey()));

        //Obtain an Iterator for the HashMap
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();

        // Iterate through the entries
        while (itr.hasNext()) {
            // Get the next entry
            Map.Entry<String, Integer> entry = itr.next();

            // Access the key and value of the entry
            String key = entry.getKey();
            Integer value = entry.getValue();

            // Print key-value pair
            System.out.println("Key: " + key + ", Value: " + value);
        }


        // Iterate through the HashMap using streams
        map.entrySet().stream()
                // Perform an action for each entry
                .forEach(entry -> {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    System.out.println("Key: " + key + ", Value: " + value);
                });
    }
}
