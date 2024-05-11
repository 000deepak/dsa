package v.collection.queue.crud;

import java.util.PriorityQueue;
import java.util.Queue;

public class create {
    public static void main(String[] args) {

        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println(pq);
    }
}
