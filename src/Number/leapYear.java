package Number;

public class leapYeat {
    public static void main(String[] args) {
        /**
         * year is divisible by 400.
         * OR
         * year is divisible by 4 but "NOT" by 100.
         */
        int year = 2020;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) System.out.println(year + " is a Leap Year");
        else System.out.println(year + " is not a Leap Year");
    }
}
