package JAVA_OOPS.JAVA_OOPS_PILLARS.POLYMORPHISM;

class Addition{
    public static int Add(int a,int b){
        int sum = a+b;

        return sum;
    } 
    public static int Add(int a,int b,int c){
        int sum = a+b+c;
        return sum;
    }
}

public class METHOD_OVERLOADING {
    public static void main(String[] args) {
        System.out.println(Addition.Add(10,20));
        System.out.println(Addition.Add(10,20,30));
    }
}
