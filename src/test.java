import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class test {
    public static void main(String[] args) {
        test t = new test();
        System.out.println(
                t.concatenatedString()

        );
    }

    public static Integer concatenatedString() {
        String s = "100011100";
        String fina = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') fina += s.charAt(i);
        }

        return fina.length();
    }
}
