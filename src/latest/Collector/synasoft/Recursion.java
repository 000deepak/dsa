package latest.Collector.synasoft;

import java.security.InvalidParameterException;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(-5));

    }

    static int factorial(int i){
        if(i == 0 || i == 1) return 1;
        else if (i < 0) {
            throw new InvalidParameterException("invalid number");
        }

        return i * factorial(i-1);
    }
}
