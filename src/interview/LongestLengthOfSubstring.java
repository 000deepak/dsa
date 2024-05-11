package interview;

import java.util.HashMap;
import java.util.Map;

/*
Longest Substring Without Repeating Characters
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
*/
public class LongestLengthOfSubstring {
    public static void main(String[] args) {
        String s = "abcacbbb";

        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right), right);
            }
        }
        System.out.println(maxLength);
    }
}

/*
a-0|a-3
b-1|c-4
c-2|
*/
