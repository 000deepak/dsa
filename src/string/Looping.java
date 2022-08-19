package string;

public class Looping {
    public static void main(String[] args) {
        String s = "asdgsdgsdfdg";

        //looping
        for (int i = 0; i < s.length() - 1; i++) {
            System.out.println(s.charAt(i));
        }
    }
}
