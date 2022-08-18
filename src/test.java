import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        System.out.println(

                reverse("Geeks")


        );


    }

    //deep
    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        //System.out.println(arr);
        int n = str.length();
        char temp = arr[0];
        //System.out.println(temp);
        for (int i = 0; i < n; i++) {
            arr[i] = arr[n - (i + 1)];
            System.out.println(arr[n - (i + 1)]);
        }
        arr[n - 1] = temp;
        String s = new String(arr);
        return s;
    }

}
