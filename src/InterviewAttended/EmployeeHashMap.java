package InterviewAttended;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EmployeeHashMap {
    String name;

    public EmployeeHashMap(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Map<EmployeeHashMap, Integer> hashmap = new HashMap<>();
        hashmap.put(new EmployeeHashMap("ABC"), 1);
        hashmap.put(new EmployeeHashMap("ABC"), 2);
        System.out.println(hashmap.get(new EmployeeHashMap("ABC")));

        /*case 1 : overriding equal & hashcode method*/
        //2

        /*case 1 : not-overriding equal & hashcode method*/
        //null
        /*because if its not overriding, then hasCode will be calculated on memory address
        * thus while getting new index we will get and equals also returns false so null*/
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeHashMap that)) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
