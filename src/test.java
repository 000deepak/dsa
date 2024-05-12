import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int n = 310;
        int n1 = 300;
        int n2 = 200;
        int sum = 0;

        int[] arr = {2, 1, 5, 9, 4};
        int key = 5;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid]==key) System.out.println(mid);
            if(key < arr[mid]) end = mid -1;
            else start = mid + 1;
        }


        System.out.println(Arrays.toString(arr));
    }
}
