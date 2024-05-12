package interview.duplicate;

import java.util.HashMap;
import java.util.Map;

/* Prints the frequency for characters in string/ s*/
public class DuplicateFrequencyCharacterNumber {
    public static void main(String[] args) {

        //character
        String str = "hellojava";

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            // Increment the frequency count of the character
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }

        //number
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 4, 2, 1};
        Map<Integer, Integer> numberFrequencyMap = new HashMap<>();

        for (int i : arr) {
            // Increment the frequency count of the character
            numberFrequencyMap.put(i, numberFrequencyMap.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numberFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
