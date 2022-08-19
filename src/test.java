import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class test {
    public static void main(String[] args) {
        test t = new test();
        System.out.println(
                t.concatenatedString()

        );
    }

    public static boolean concatenatedString() {
        String A = "deep";
        String B = "ee";

        int i = 0, j = 0;

        while (i < B.length() && j < A.length()) {
            if (B.charAt(i) == A.charAt(j)) j++;
            i++;
        }

        return j == A.length();
    }
}
