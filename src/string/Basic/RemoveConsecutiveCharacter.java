package string.Basic;

public class RemoveConsecutiveCharacter {
    public static void main(String[] args) {

    }
    public String removeConsecutiveCharacter(String S) {
        String line = "";
        line = line + S.charAt(0);

        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == S.charAt(i + 1)) continue;
            else line += S.charAt(i + 1);
        }
        return line;
    }
}
