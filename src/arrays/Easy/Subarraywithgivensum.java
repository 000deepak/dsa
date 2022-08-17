package arrays.Easy;

import java.util.ArrayList;

/**
 * Given an unsorted array A of size N that contains only non-negative integers,
 * find a continuous sub-array which adds to a given number S.
 * In case of multiple subarrays,return the subarray which comes first on moving from left to right.
 * Example 1:
 * <p>
 * Input:
 * N=5,S=12
 * A[]={1,2,3,7,5}
 * Output:2 4
 * Explanation:The sum of elements
 * from 2nd position to 4th position
 * is 12.
 * Example 2:
 * <p>
 * Input:
 * N=10,S=15
 * A[]={1,2,3,4,5,6,7,8,9,10}
 * Output:1 5
 * Explanation:The sum of elements
 * from 1st position to 5th position
 * is 15.
 */

public class Subarraywithgivensum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};

        System.out.println(subArraySum(arr, arr.length, 12));
    }

    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subArraySum(int[] arr, int n, int s) {
        int start = 0;
        int last = 0;
        boolean flag = false;
        int currsum = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();

        //iterating over the array.
        for (int i = 0; i < n; i++) {
            //storing sum upto current element.
            currsum += arr[i];

            //checking if current sum is greater than or equal to given number.
            if (currsum >= s) {
                last = i;
                //we start from starting index till current index and do the
                //excluding part while s(given number) < currsum.
                while (s < currsum && start < last) {
                    //subtracting the element from left i.e., arr[start]
                    currsum -= arr[start];
                    ++start;
                }

                //now if current sum becomes equal to given number, we store
                //the starting and ending index for the subarray.
                if (currsum == s) {
                    res.add(start + 1);
                    res.add(last + 1);

                    //flag is set to true since subarray exists.
                    flag = true;
                    break;
                }
            }
        }
        //if no subarray is found, we store -1 in result else the found indexes.
        if (flag == false) {
            res.add(-1);
        }
        //returning the result.
        return res;
    }

}

