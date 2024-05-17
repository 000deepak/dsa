import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {

        String s = "asdfasdf";


        Map<Character,Integer> fMap = new HashMap<>();
        for(char c : s.toCharArray()){
            fMap.put(c, fMap.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> entry: fMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        int arr[] = {1,2,3,4,2,3,4};
        Map<Integer,Integer> dMap = new HashMap<>();
        for(int i : arr){
            dMap.put(i,dMap.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: dMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



    }
}
