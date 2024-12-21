import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8};
        int start = 0;
        int end = arr.length -1;

        for(int i = 0; i< end; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

}
