package JAVA_BASICS;
public class JAVA_07_METHODS{

    public static void sumOfTwo(int a,int b){

        int sum = a+b;
        System.out.println(sum);
    }

    public static void subOfTwo(int a,int b){

        int sub = a-b;
        System.out.println(sub);
    }

    public static int mulOfTwo(int a,int b){

        int mul = a*b;
        System.out.println(mul);
        return 1;
    }
    public static void Float(float a, float b){

        float div =a/b;
        System.out.println(div);
        System.out.println(String.format("%3.f",div));
    
    }

    public static void main(String[] args) {
        sumOfTwo(5, 9);
        subOfTwo(10, 8);
        mulOfTwo(5, 5);
        Float(2.555f, 1.222f);
        
    }

}