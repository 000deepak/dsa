package string.Basic;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

    }

    public static char[] sort(String s) {
        char[] tempArray = s.toCharArray();
        Arrays.sort(tempArray);
        return tempArray;
    }
}
