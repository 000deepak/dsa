package string.Basic;

public class MaxOccuringChar {
    public static void main(String[] args) {

    }

    public static char getMaxOccuringChar(String line) {
        // Your code here
        int[] a = new int[26];
        for (int i = 0; i < line.length(); i++) {
            a[line.charAt(i) - 'a']++;
        }
        int max_i = 0;
        for (int i = 0; i < 26; i++) {
            if (a[i] > a[max_i]) max_i = i;
        }
        return (char) (max_i + 'a');
    }
}
