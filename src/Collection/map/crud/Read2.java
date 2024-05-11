package Collection.map.crud;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Read2 {
    public static void main(String[] args) {

        /**Method #1: Iterating over entries using a For-Each loop.*/
        //This is the most common method and is preferable in most cases.
        // It should be used if you need both map keys and values in the loop.
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
//        Note that the For-Each loop was introduced in Java 5,
//        so this method is working only in newer versions of the language.
//        Also a For-Each loop will throw NullPointerException if you try to iterate over a map that is null,
//        so before iterating you should always check for null references.

        /** Method #2: Iterating over keys or values using a For-Each loop.*/
        //If you need only keys or values from the map, you can iterate over keySet or values instead of entrySet.
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        // Iterating over keys only
        for (Integer key : map2.keySet()) {
            System.out.println("Key = " + key);
        }

        // Iterating over values only
        for (Integer value : map2.values()) {
            System.out.println("Value = " + value);
        }

        /**Method #3: Iterating using Iterator.*/
        //You can also use same technique to iterate over keySet or values.

        //Using Generics:
        Map<Integer, Integer> map3 = new HashMap<Integer, Integer>();
        Iterator<Map.Entry<Integer, Integer>> entries1 = map3.entrySet().iterator();
        while (entries1.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries1.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        //Without Generics:
        Map map = new HashMap();
        Iterator entries2 = map.entrySet().iterator();
        while (entries2.hasNext()) {
            Map.Entry entry = (Map.Entry) entries2.next();
            Integer key = (Integer) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println("Key = " + key + ", Value = " + value);
        }


//        This method might look redundant, but it has its own advantages.
//        First of all, it is the only way to iterate over a map in older versions of Java.
//        The other important feature is that it is the only method that allows you to remove entries from the
//        map during iteration by calling iterator.remove(). If you try to do this during For-Each iteration you will get
//        "unpredictable results" according to Javadoc.


//        Conclusion:
//        If you need only keys or values from the map, use method #2.
//        If you are stuck with older version of Java (less than 5) or planning to remove entries during iteration,
//        you have to use method #3.
//        Otherwise use method #1.

    }
}