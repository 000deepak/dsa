package string;

import java.util.Arrays;

public class CharOccurence {
    public static void main(String[] args) {
        String s = "deeeeep";

        int[] a = new int[26];

        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }

        System.out.println(Arrays.toString(a));//[0, 0, 0, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        //beacause e is at 4 position
        System.out.println(a[4]);//5
    }
}
