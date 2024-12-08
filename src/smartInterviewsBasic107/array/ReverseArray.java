package smartInterviewsBasic107.array;

//Reverse Array
//Print the array in reverse order.
//Note:
//Try solving this using recursion. Do not use any inbuilt functions / libraries for your main logic.
//Input Format
//The first line of input contains N - the size of the array and the second line contains the elements of the array.
//Output Format
//Print the given array in reverse order.
public class ReverseArray {
    public static int[] reverse(int n, int[] arr) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int start = 0;
        int end = arr.length -1;

        while (start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }

        return arr;
    }
}
