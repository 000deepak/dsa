package Number;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 23;
        checkPrime(n);
    }

    private static void checkPrime(int n) {
        int count = 0;

        // negative numbers, 0 and 1 are not prime
        if (n < 2) System.out.println("not prime");

        // checking the number of divisors b/w [1, n]
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count += 1;
        }

        // if count of divisors greater than 2 then its not prime
        if (count > 2) System.out.println("not prime");
        else System.out.println("Tprime");
    }
}
