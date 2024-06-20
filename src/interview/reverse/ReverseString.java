package interview.reverse;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "arora";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) rev = rev + str.charAt(i);
        if (str.equals(rev)) System.out.println("palindrome");
        else System.out.println("not palindrome");




        //using java 8
        String str1 = "hello world hello";
        Integer i = 234;
        String s2 = String.valueOf(i);
        Stream.of(str1).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(""));

        Stream.of(s2)
                .map(word ->
                        new StringBuilder(word)
                                .reverse())
                .forEach(System.out::println);
        //.collect(Collectors.joining(" "));
        System.out.println(s2);
    }

    public static char[] sort(String s) {
        char[] tempArray = s.toCharArray();
        Arrays.sort(tempArray);
        return tempArray;
    }
}
