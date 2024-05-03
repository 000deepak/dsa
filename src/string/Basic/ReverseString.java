package string.Basic;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "arora";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) rev = rev + s.charAt(i);
        if (s.equals(rev)) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }

    public static char[] sort(String s) {
        char[] tempArray = s.toCharArray();
        Arrays.sort(tempArray);
        return tempArray;
    }
}
