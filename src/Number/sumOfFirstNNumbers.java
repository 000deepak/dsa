package Number;

public class sumOfFirstNNumbers {
    public static void main(String[] args) {
        int n = 6473;
        int sum = 0;

        while(n>0){
            var i = n%10;
            sum = sum*10+i;
            n /= 10;
        }

        System.out.println(sum == 3746);
    }
}
