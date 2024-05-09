import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class test {
    public static void main(String[] args) {
        String[] arr = {"floawer","floaor","floaod"};
        for(int i =0;i<arr[0].length();i++){
            char c = arr[0].charAt(i);
            for(int j =1;j<arr.length;j++){
                String s = arr[j];
                if(c==s.charAt(i)) System.out.println(s.charAt(i));
            }
        }
//        String test = "shiva";
//        int num = 0;
//        int originalNum = num;
//        int sum = 10;
//
//        int n1 = 10;
//        int n2 = 25;
//        int hcf = 0;
//
//
//        for(int i=1;i<n1*n2;i++){
//            if(i%n1 == 0 && i%n2==0){
//                hcf = i;
//            }
//        }
//
//        System.out.println(hcf);
    }
}
