package JAVA_ADVANCED.COLLECTIONS.SET;
import java.util.*;
public class TREE_SET {
    public static void main(String[] args) {
        Set <Integer> set = new TreeSet<>(); // Set with sorted and other all same properties

        set.add(32);
        set.add(26);
        set.add(82);
        set.add(92);
        set.add(46);
        set.add(82); // Dont save duplicate element
        

        System.out.println(set);
        
        set.remove(82); // Removes element

        System.out.println(set);

        System.out.println(set.contains(100)); // Checks weather the element contains in the set

        System.out.println(set.isEmpty()); // Checks weather the element is empty

        System.out.println(set.size()); // returns the size of the set

        set.clear(); // Clears the set

        System.out.println(set);
    }
}
