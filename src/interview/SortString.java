package interview;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "test";

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = String.valueOf(charArray);

        System.out.println(str);
    }
}
