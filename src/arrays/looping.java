package arrays;

public class looping {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int x;

        // iterating over an array
        for (int i = 0; i < ar.length; i++) {

            // accessing each element of array
            x = ar[i];
            System.out.print(x + " ");
        }

        // iterating over an array
        for (int i : ar) {
            // accessing each element of array
            x = i;
            System.out.print(x + " ");
        }
    }
}
