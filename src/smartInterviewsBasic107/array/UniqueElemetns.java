package smartInterviewsBasic107.array;

import java.util.LinkedHashSet;
import java.util.Set;

//Unique Elements
//Print unique elements of the array in the same order as they appear in the input.
//
//
//
//Note:
//
//Do not use any inbuilt functions / libraries for your main logic.
//
//
//
//Input Format
//The first line of input contains the size of the array - N and the second line contains the elements of the array.
//
//
//
//Output Format
//
//Print unique elements from the given array.
//
//
//
//Constraints
//
//1 <= N <= 100
//
//0 <= ar[i] <= 109
//
//
//
//Example
//
//Input
//
//7
//
//5 4 10 9 21 4 10
//
//
//
//Output
//
//5 9 21
//
//
//
//Explanation
//
//
//
//Self Explanatory
public class UniqueElemetns {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        int n = 2;
        Set<Integer> lhs = new LinkedHashSet<>();
        for(int i = 0; i< n; i++){
            if(lhs.contains(arr[i])){
                lhs.remove(arr[i]);
            } else{
                lhs.add(arr[i]);
            }
        }
        for(Integer num : lhs){
            System.out.print(num + " ");
        }
    }

}
