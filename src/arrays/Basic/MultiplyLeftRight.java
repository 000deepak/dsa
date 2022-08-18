package arrays.Basic;

public class MultiplyLeftRight {
    public static void main(String[] args) {

    }
    public static int multiply(int arr[], int n) {
        //Complete the function

        int leftSum = 0;
        int rightSum = 0;

        if (n % 2 == 0) {
            for (int i = 0; i < (n / 2); i++) {
                leftSum = leftSum + arr[i];
                rightSum = rightSum + arr[n - (i + 1)];
            }
        } else {
            for (int i = 0; i < (n / 2); i++) {
                leftSum = leftSum + arr[i];
            }
            for (int i = n-1; i >= (n / 2); i--) {
                rightSum = rightSum + arr[i];
            }
        }
        return leftSum * rightSum;
    }
}
