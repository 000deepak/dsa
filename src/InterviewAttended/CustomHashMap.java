package InterviewAttended;

import java.util.HashMap;

public class CustomHashMap<K,V> extends HashMap<K,V> {
    public int getPutCounter() {
        return putCounter;
    }

    private int putCounter = 0;

    @Override
    public V put(K key,V value){
        putCounter++;
        return super.put(key,value);
    }
}
