package string;

public class Reverse {
    public static void main(String[] args) {

    }

    public static String reverseWord(String str) {
        // Reverse the string str
        char[] a = str.toCharArray();
        int n = a.length;
        int i;
        char t;
        for (i = 0; i < n / 2; i++) {
            //storing 1st element
            t = a[i];

            //assigning other
            a[i] = a[n - i - 1];

            //storing last
            a[n - i - 1] = t;
        }
        String s = new String(a);
        return s;
    }
}
