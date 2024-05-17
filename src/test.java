import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {

        String s1 = "asdfasdf";
        String s2 = "asdfasdf";

        char[] arr = new char[26];

        if (s1.length() != s2.length()) System.out.println(false);

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) System.out.println(false);
            ;
        }


    }
}
