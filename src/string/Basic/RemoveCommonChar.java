package string.Basic;

public class RemoveCommonChar {
    public static void main(String[] args) {

    }
    public static String concatenatedString(String s1, String s2) {
        String fina = "";
        for (int i = 0; i < s1.length(); i++) {
            /**Character.toString:convert charater to string t use contain*/
            if (!s2.contains(Character.toString(s1.charAt(i)))) {
                fina += s1.charAt(i);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (!s1.contains(Character.toString(s2.charAt(i)))) {
                fina += s2.charAt(i);
            }
        }
        if (fina == "") return "-1";

        System.out.println(fina);
        return fina;
    }
}
