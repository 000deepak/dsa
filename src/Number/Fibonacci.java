package Number;

public class Fibonacci {
    public static void main(String[] args) {
        Fib(10);

    }

    static void Fib(int n) {
        int n1 = 0, n2 = 1, n3;

        for (int i = 2; i < n; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
