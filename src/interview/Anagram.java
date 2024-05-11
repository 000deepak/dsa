package interview;

public class Anagram {
    public static void main(String[] args) {
        String s = "asdf";
        String t = "fdsa";
        char[] arr = new char[26];

        if (s.length() != t.length()) System.out.println(false);

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
