package Number;

public class armStrong {
    public static void main() {
        System.out.println(isArmstrong(371));
    }

    private static boolean isArmstrong(int num) {
        int originalNumber = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return originalNumber == sum;
    }
}





