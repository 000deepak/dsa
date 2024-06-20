package latest.Collector.synasoft;

import java.util.List;

public class GenericMethd {
    public static void main(String[] args) {
        List<String> stringList = List.of("generic","method");
        List<Integer> intList = List.of(1,2,3,5,8);

        genericMethod(stringList);
        genericMethod(intList);
    }

    public static <T>void genericMethod(List<T> testList){
        for(T t: testList){
            try{
                System.out.println(t);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}


