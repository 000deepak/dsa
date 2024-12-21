package Number;

//i = i, OR condition
//number%i
public class HCF {
    public static void main(String[] args) {
        int num1 = 25, num2 = 10, hcf = 0;

        // Loop only up to the smaller number
        int limit = (num1 < num2) ? num1 : num2;

        for (int i = 1; i <= limit; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("The HCF: " + hcf);
    }
}
