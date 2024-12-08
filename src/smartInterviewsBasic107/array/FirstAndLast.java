package smartInterviewsBasic107.array;
//First and Last
//You are given an array A of size N, containing integers. Your task is to find the first and last occurrences of a given element X in the array A and print them.
//
//
//
//Input Format
//
//The input consists of three lines. The first line contains a single integer N - the size of the array. The second line contains N integers separated by a space, representing the elements of the array A. The third line contains a single integer X.
//
//
//
//Output Format
//
//Print the indexes of the first and last occurrences separated by a space.
//
//
//
//Constraints
//
//1 <= N <= 103
//
//1 <= A[i] <= 105
//
//X ∈ A
//
//
//
//Example
//
//Input
//
//10
//
//1 3 5 7 9 11 3 13 15 3
//
//3
//
//
//
//Output
//
//1 9
//
//
//
//Explanation
//
//
//
//Self Explanatory
public class FirstAndLast {
    int firstIndex = -1;
    int lastIndex = -1;

        for(int i = 0; i< arr.length; i++){
        if(arr[i] == x) {
            if(firstIndex == -1){
                firstIndex = i;
            }

            lastIndex = i;
        }

    }


        System.out.println(firstIndex + " " + lastIndex);
}
