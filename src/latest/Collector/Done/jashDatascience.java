package latest.Collector.Done;

import java.util.Arrays;

public class jashDatascience {
    public static void main(String[] args) {
        int[] arr1 = {5,5,8,9,15,20,88};
        int[] arr2 = {6,6,7,8,9,12,22,25,99,150,200};
        //you are given two sorted arrays.
        //Write a function to combine these two arrays into a third sorted array.
        mergeSortedArrays(arr1,arr2);


    }

    public static void mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr1.length;
        int[] finalArray = new int[n1+ n2];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                finalArray[k++] = arr1[i++];
            }else {
                finalArray[k++] = arr2[j++];
            }

        }

        while (i < n1) finalArray[k++] = arr1[i++];
        while (j < n2) finalArray[k++] = arr2[j++];


        System.out.println(Arrays.toString(finalArray));

    }
}
