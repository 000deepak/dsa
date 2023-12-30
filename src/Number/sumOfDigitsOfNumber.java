package Number;

public class sumOfDigitsOfNumber {
    public static void main(String[] args) {
        //variables initialization
        int num = 1234, reverse = 0, rem;


        //loop to find reverse number
        while (num != 0) {
            rem = num % 10;// rem = 4,3,2,1
            reverse = reverse * 10 + rem;//reverse = 4,40+3,430+2,4320+1
            num /= 10;//num = 123,12,1
        }
        ;
    }

}



