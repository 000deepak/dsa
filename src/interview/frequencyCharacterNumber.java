package interview;

import java.util.HashMap;
import java.util.Map;

/* Prints the frequency for characters in string/ s*/
public class frequencyCharacterNumber {
    public static void main(String[] args) {
        String str = "hellojava";

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            // Increment the frequency count of the character
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
