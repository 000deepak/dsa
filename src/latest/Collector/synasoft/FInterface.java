package latest.Collector.synasoft;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FInterface {
    public static void main(String[] args) {
        Funtional f = (a,b)-> System.out.println("sum is " + (a+b));
        f.sumMethod(5,2);

        List<Integer> li = List.of(1,2,3,4,5,8,7,4,2,1,3);
        Map<Integer,Integer> intFreq = new HashMap<>();

        for(int i : li){
            intFreq.put(i,intFreq.getOrDefault(i,0)+1);
        }

        intFreq.forEach((k,v) -> System.out.println(k +" " + v));

//        intFreq.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() +" " + entry.getValue()));
    }



}
@FunctionalInterface
interface Funtional{
    void sumMethod(int a, int b);

}
