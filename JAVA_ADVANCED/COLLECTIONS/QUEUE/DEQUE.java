package JAVA_ADVANCED.COLLECTIONS.QUEUE;

import java.util.ArrayDeque;

public class DEQUE {
    public static void main(String[] args) {
        ArrayDeque <Integer> adq = new ArrayDeque<>();

        adq.offer(23); // Adds an element 
        adq.offerFirst(30); // Adds element to head of queue
        adq.offerLast(40); // Adds element to last of queue
        adq.offer(43);
        adq.offer(66);
        adq.offer(78);

        System.out.println(adq.peek());  // Returns the element to be removed
        System.out.println(adq.peekFirst()); //Returns the first element to be remove
        System.out.println(adq.peekLast()); // Returns the last element to be remove

        System.out.println(adq);

        System.out.println(adq.poll()); //Remove the element
        System.out.println(adq.pollFirst()); //Remove the first element
        System.out.println(adq.pollLast()); // Remove the last element

        System.out.println(adq);


    }
}
