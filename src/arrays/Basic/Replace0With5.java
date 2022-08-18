package arrays.Basic;

public class Replace0With5 {
    public static void main(String[] args) {
        int[] arr = Integer.toString(12056).chars().map(c -> c - '0').toArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 5;
            }
        }

        Integer n = 0;
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        n = Integer.parseInt(s);
        System.out.println(n);
    }
}
