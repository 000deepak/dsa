package interview;

import java.util.HashSet;
import java.util.Set;

public class LongestLengthOfSubstring {
    public static void main(String[] args) {
        LongestLengthOfSubstring solution = new LongestLengthOfSubstring();
        String input = "abcabcbb";
        String str = "aabbbccccbbaa";
        int nonRepeat = solution.lengthOfLongestNonRepeating(input);
        int repeat = solution.lengthOfRepeating(str);
        System.out.println("The length of the longest substring: " + nonRepeat + "  " + repeat);
    }

    public int lengthOfLongestNonRepeating(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static int lengthOfRepeating(String s) {
        int n = s.length();
        int maxLength = 0;
        int i = 0, j = 0;
        Set<Character> set = new HashSet<>();

        while (j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxLength;
    }

/*        Explanation of the Code
        Initialization:

        int n stores the length of the string.
        int maxLength keeps track of the maximum length found.
        int left is the left pointer of the window.
                HashSet<Character> set keeps track of characters in the current window.
                Iterating with Right Pointer:

        For each character s.charAt(right) from the start to the end of the string:
        If s.charAt(right) is already in the set, it means there's a duplicate, so we remove characters from the set starting from the left until the duplicate is removed.
        Add the current character s.charAt(right) to the set.
                Update maxLength to be the maximum of the current maxLength and the size of the current window (right - left + 1).
                Result:

        Finally, the method returns the maxLength, which is the length of the longest substring without repeating characters.
    */
}


