package smartInterviewsBasic107.array;

//Odd and Even Sum
//Given an array of size N. Print the sum of odd and even numbers separated by a space.
//
//Input Format
//The first line of input contains N - the size of the array and the second line contains elements of the array.
//
//Output Format
//Print the sum of odd elements followed by sum of even elements.
//
//Constraints
//1 <= N <= 103
//1 <= ar[i] <= 106
//
//Example
//Input
//5
//4 6 9 2 5
//
//Output
//14 12
//
//Explanation
//
//Self Explanatory
public class OddEvenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,8};
        int n = arr.length;
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i< n; i++){
            if((arr[i]&1)==0) {
                evenSum+= arr[i] ;
            }else{
                oddSum+= arr[i];
            }

        }
        System.out.println(oddSum + " " + evenSum);
    }
}
