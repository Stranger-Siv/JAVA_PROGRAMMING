package JAVA_ADVANCED.COLLECTIONS.MAP;

import java.util.TreeMap;
import java.util.Map;


public class TREE_MAP {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>(); // Sorts in term of keys

        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);

        numbers.remove("Three");

        // numbers.put("Two",23); // Here the value gets override

        numbers.putIfAbsent("Two", 23); // Checks weather the key exist if yes it will ignore else it will set

        for(Map.Entry<String,Integer>e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println(numbers);

        System.out.println(numbers.containsValue(3));
    }
}
