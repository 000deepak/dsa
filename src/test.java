import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        int[] arr = {5,6,8};
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));

    }


}

interface Functional {
    void test();
}
