package Number;

//max
//i = 1, AND codition
//i%number
//break
public class LCM {
    public static void main(String[] args) {
        int num1 = 200, num2 = 300, lcm = 0;

        // finding the larger number here
        int max = (num1 > num2) ? num1 : num2;

        // LCM will atleast be >= max(num1, num2)
        // Largest possibility of LCM will be num1*num2
        for (int i = max; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("The LCM: " + lcm);
    }
}
