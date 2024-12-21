package string.Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    //method 1
    public static boolean isAnagram(String str1, String str2) {
        // Remove whitespace and convert to lowercase for case insensitivity
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    //method 2
    public static boolean isAnagramCharacterArray(String str1, String str2) {
        // Remove whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to count characters
        int[] charCounts = new int[256]; // Assuming ASCII characters

        // Increment counts for the first string
        for (char c : str1.toCharArray()) {
            charCounts[c]++;
        }

        // Decrement counts for the second string
        for (char c : str2.toCharArray()) {
            charCounts[c]--;
        }

        // Check if all counts are zero
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";

        if (isAnagram(string1, string2)) {
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are not anagrams.");
        }
    }
}
