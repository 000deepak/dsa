package interview.frequency;

import java.util.Arrays;

public class FreqOfCharWithoutHashMap {
    public static void main(String[] args) {
        String str = "hello world";

        int[] charCounts = new int[256]; // Assuming ASCII characters

        System.out.println(Arrays.toString(charCounts));
        // Counting occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i)]++;
        }
        System.out.println(Arrays.toString(charCounts));


        // Printing occurrences of each character
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] != 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
    }
}
