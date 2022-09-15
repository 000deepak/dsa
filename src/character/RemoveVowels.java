package character;

import java.util.Locale;

public class RemoveVowels {

    public static void main(String[] args) {

        String s = "prepinsta";
        String s1 = "";
        s.toLowerCase();
        s1 = s.replaceAll("[aeiou]", "");
        System.out.println("String after removing vowel : " + s1);
    }
}
