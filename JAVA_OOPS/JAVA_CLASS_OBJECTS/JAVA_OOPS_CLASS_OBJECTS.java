package JAVA_OOPS.JAVA_CLASS_OBJECTS;

public class JAVA_OOPS_CLASS_OBJECTS {

    int age = 18;
    int weight = 70;
    String color = "white";

    void eat() {
        System.out.println("Im eating");
    }

    void sleep() {
        System.out.println("Im sleeping");
    }

    public static void main(String[] args) {
        JAVA_OOPS_CLASS_OBJECTS p = new JAVA_OOPS_CLASS_OBJECTS(); 
        System.out.println(p.age);
        System.out.println(p.weight);
        System.out.println(p.color);

        p.eat();
        p.sleep();
    }
}
