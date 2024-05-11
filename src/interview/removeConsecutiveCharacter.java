package interview;

/*
* S = aabaa
* Output:  aba
*/
public class removeConsecutiveCharacter {
    public static void main(String[] args) {
        String s = "asdfASDF";

        String res = "";
        res += s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
