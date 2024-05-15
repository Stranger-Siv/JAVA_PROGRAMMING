package JAVA_OOPS.JAVA_CONSTRUCTOR;

public class PRIVATE_CONSTRUCTOR {
    int a;
    double b;
    String c;
    private PRIVATE_CONSTRUCTOR(){
        a=10;
        b=20.21;
        c="Ankit"; 
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        PRIVATE_CONSTRUCTOR r = new PRIVATE_CONSTRUCTOR();
    }

}
