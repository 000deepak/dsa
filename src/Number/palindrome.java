package Number;

public class palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(151));
        System.out.println(isPalindromeCharAt("151"));
        System.out.println(isPalindromeStringBuilder("151"));

    }

    private static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }

    private static boolean isPalindromeCharAt(String original) {
        String reversed = "";
        int len = original.length();

        for (int i = len - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        return original.equals(reversed);
    }

    private static boolean isPalindromeStringBuilder(String string) {

        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }


}
