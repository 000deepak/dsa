package interview;

public class Anagram {
    public static void main(String[] args) {
        String s = "asdf";
        String t = "fdsa";
        char[] arr = new char[26];

        if (s.length() != t.length()) System.out.println(false);

        /*
        * The character 'a' has a Unicode value of 97,
        * 'b' is 98, and so on up to 'z', which is 122.
        * So, if s.charAt(i) is 'a', s.charAt(i) - 'a' would be 97 - 97 = 0,
        * if it's 'b', it would be 98 - 97 = 1,
        * and so forth.
        */
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) System.out.println(false);
        }
        System.out.println(true);
    }
}
