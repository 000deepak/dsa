package string.Basic;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        System.out.println(sort("deep"));

    }

    public static char[] sort(String s) {
        char[] tempArray = s.toCharArray();
        Arrays.sort(tempArray);
        return tempArray;
    }
}
