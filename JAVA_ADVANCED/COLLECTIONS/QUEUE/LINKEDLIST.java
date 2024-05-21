package JAVA_ADVANCED.COLLECTIONS.QUEUE;

import java.util.*;

public class LINKEDLIST {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();

        queue.offer(12); // Insert the specified element into the queue
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);

        System.out.println(queue);

        System.out.println(queue.poll()); // Returns and remove the head of queue
        System.out.println(queue);

        queue.add(22); // Similar to offer
        System.out.println(queue);

        System.out.println(queue.peek()); // Same as element

        System.out.println(queue.element()); //Returns the head of queue
    }
}
