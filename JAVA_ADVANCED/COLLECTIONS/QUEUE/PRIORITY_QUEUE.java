package JAVA_ADVANCED.COLLECTIONS.QUEUE;
import java.util.*;
public class PRIORITY_QUEUE {
    public static void main(String[] args) {
        Queue <Integer> pq = new PriorityQueue<>(); // Applies Min heap
        // Queue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  {Applies Max heap}

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
 
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
