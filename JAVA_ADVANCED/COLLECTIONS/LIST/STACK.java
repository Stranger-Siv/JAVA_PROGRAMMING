package JAVA_ADVANCED.COLLECTIONS.LIST;

import java.util.Stack;

public class STACK {

    public void isFull(){
        
    }

    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();

        animal.push("Lion"); // PUSH
        animal.push("Tiger");
        animal.push("Cheetah");
        animal.push("Dog");
        animal.push("Horse");
        animal.push("Cow");

        System.out.println("Stack: " +animal);

        System.out.println(animal.peek());     //PEEK  

        animal.pop();
        System.out.println(animal.peek());     
        System.out.println(animal);
        animal.pop();                            // POP
        System.out.println(animal.peek());    
        System.out.println(animal);

        System.out.println(animal.isEmpty());   // EMPTY

    }
}
