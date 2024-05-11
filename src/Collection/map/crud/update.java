package Collection.map.crud;

import java.util.HashMap;

public class update {
    public static void main(String args[]) {

        /* This is how to declare HashMap */
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");


        /* Get values based on key*/
        String var= hmap.get(2);
        System.out.println("Value at index 2 is: "+var);
    }
}
