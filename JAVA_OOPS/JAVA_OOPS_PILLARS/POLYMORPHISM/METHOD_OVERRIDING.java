package JAVA_OOPS.JAVA_OOPS_PILLARS.POLYMORPHISM;

class Parent{
    void print(){
        System.out.println("Parent");
    }
}

class subclass1 extends Parent{
    void print(){
        System.out.println("Subclass 1");
    }
}

class subclass2 extends Parent{
    void print(){
        System.out.println("Subclass 2");
    }
}

public class METHOD_OVERRIDING {
   public static void main(String[] args) {
    Parent a = new Parent();

   a = new subclass1();
   a.print();

   a=new subclass2();
   a.print();
   }
}
