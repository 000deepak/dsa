package latest.Collector.Done;

import java.util.HashMap;
import java.util.Map;

public class hashMapFulcrum {
    public int hashCode() {
        return 0;
    }

    public boolean equals(Object obj) {
        return false;//true
    }

    public static void main(String[] args) {
        Map<hashMapFulcrum, Integer> map = new HashMap<>();
        hashMapFulcrum a1 = new hashMapFulcrum();
        hashMapFulcrum a2 = new hashMapFulcrum();
        hashMapFulcrum a3 = a2;

        map.put(a1, 1);
        map.put(a2, 2);
        map.put(a3, 3);
        map.put(new hashMapFulcrum(), 4);

        System.out.println(map.get(a1));//1
        System.out.println(map.get(a2));//2
        System.out.println(map.get(a3));//3
        System.out.println(map.get(new hashMapFulcrum()));//4

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
