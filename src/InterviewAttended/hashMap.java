package InterviewAttended;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public int hashCode() {
        return 0;
    }

    public boolean equals(Object obj) {
        return false;//true
    }

    public static void main(String[] args) {
        Map<hashMap, Integer> map = new HashMap<>();
        hashMap a1 = new hashMap();
        hashMap a2 = new hashMap();
        hashMap a3 = a2;

        map.put(a1, 1);
        map.put(a2, 2);
        map.put(a3, 3);
        map.put(new hashMap(), 4);

        System.out.println(map.get(a1));//1
        System.out.println(map.get(a2));//2
        System.out.println(map.get(a3));//3
        System.out.println(map.get(new hashMap()));//4

        /*
         * equals() returns true
         * 4
         * 4
         * 4
         * 4
         * */

        /*
         * equals() returns false
         * 1
         * 3
         * 3
         * null
         * */
    }
}
