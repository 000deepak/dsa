package Number;

public class factorial {
    public static void main(String[] args) {
        factorial(10);
    }

    public static void factorial(int num) {
        if (num == 0 || num == 1) {
            System.out.println(1 + " is the factorial of" + num);
        } else {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println(fact + " is the factorial of" + num);
        }
    }
}
