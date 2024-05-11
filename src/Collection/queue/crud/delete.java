package v.collection.queue.crud;

import java.util.PriorityQueue;
import java.util.Queue;

public class delete {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");


        pq.remove("Geeks");
        System.out.println("After Remove " + pq);

        pq.poll();
        System.out.println("Final Queue " + pq);
    }
}
