package arrays;

public class ReadNumber {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;

        while (temp != 0) {
            int r = temp % 10;
            System.out.println(r);
            temp = temp / 10;
        }
    }
}
