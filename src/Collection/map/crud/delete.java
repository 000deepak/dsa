package Collection.map.crud;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class delete {
    public static void main(String args[]) {

        /* This is how to declare HashMap */
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");


        /* Remove values based on key*/
        hmap.remove(3);

        System.out.println("Map key and values after removal:" + " " + hmap);

    }
}

