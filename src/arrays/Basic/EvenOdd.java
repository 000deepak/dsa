package arrays.Basic;

public class EvenOdd {
    public static void main(String[] args) {
        int n = 12;
        boolean result = (n & 1) != 1;
        System.out.println(result);

        //even //n&1 ==0
        //odd  //n&0 ==1

    }
}
