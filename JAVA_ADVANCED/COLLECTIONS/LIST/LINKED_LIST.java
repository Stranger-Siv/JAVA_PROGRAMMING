package JAVA_ADVANCED.COLLECTIONS.LIST;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LINKED_LIST {
    public static void main(String[] args) {
        List<String> studentName = new LinkedList<>();
        studentName.add("Rakesh"); // Add function is used to add items in the list
        studentName.add("Onkar");
        studentName.add("Sivram");
        studentName.add("Ronit");
        System.out.println(studentName);

        studentName.add(1,"Sujal"); //This will add Sujal to index 1

        System.out.println(studentName);

        List<String> studentName1 = new LinkedList<>();
        studentName1.add("Abhijeet");
        studentName1.add("Yash");
        studentName1.add("Shubham");

        studentName.addAll(studentName1); // This will add all the elements of second arraylist to the desired arraylist
        System.out.println(studentName);

        System.out.println(studentName.get(2)); // This will return the element present on the desired index u have asked for 

        studentName.remove(1);
        System.out.println(studentName); // Removes the element present at the index 1 

        studentName.remove(String.valueOf("Yash")); // Removes the element with value of desired item
        System.out.println(studentName);

        studentName.clear();  // removes all the element of the ArrayList
        System.out.println(studentName);

        studentName1.set(2,"Gaurav"); // Changes the element of desired index woth the desired value
        System.out.println(studentName1);

        System.out.println(studentName1.contains("Gaurav"));;

        for(int i=0;i<studentName1.size();i++){
            System.out.println("My son names are "+studentName1.get(i));
        }   

        for (String string : studentName1) {
            System.out.println("Friend "+string);
        }

        Iterator<String> it = studentName1.iterator();
        while(it.hasNext()){
            System.out.println("Iterator " + it.next());
        }
    }
}
