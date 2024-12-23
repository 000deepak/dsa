package smartInterviewsBasic107.array;

import java.util.Arrays;

///Find Duplicate Number in Array
//Find a duplicate element in the given array of integers. There will be only a single duplicate element in the array.
//
//
//
//Note:
//
//Do not use any inbuilt functions / libraries for your main logic
//
//
//
//Input Format
//The first line of input contains the size of the array - N and the second line contains the elements of the array, there will be only a single duplicate element in the array.
//
//
//
//Output Format
//
//Print the duplicate element from the given array.
//
//
//
//Constraints
//
//2 <= N <= 100
//
//0 <= ar[i] <= 109
//
//
//
//Example
//
//Input
//
//6
//
//5 4 10 9 21 10
//
//
//
//Output
//
//10
//
//
//
//Explanation
//
//
//
//Self Explanatory
public class DuplicateNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,8};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 1;i< n ;i++){
            if(arr[i]==arr[i-1]){
                System.out.print(arr[i] +" ");
            }
        }
    }
}
