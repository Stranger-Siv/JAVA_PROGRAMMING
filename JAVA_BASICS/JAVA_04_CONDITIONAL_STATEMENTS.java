package JAVA_BASICS;
public class JAVA_04_CONDITIONAL_STATEMENTS {

    public static void if_condition(){

        int age =20;
        if(age >= 18){
            System.out.println("You are an adult");
        }

    }

    public static void if_else_condition(){

        int age =25;
        if(age >=18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a teen");
        }

    }

    public static void nested_if_else_condition(){ // Biggest of 3 

        int a = 10 ;int b= 20;int c = 30;
        if(a>=b){
            if(a>=c){
                System.out.println("a is the biggest integer with value "+a);
            }
        }
        else{
            System.out.println("c is the biggest integer with value "+c);
        }

        if(b>=c){
            System.out.println("b is the biggest integer with value "+b);
        }
        else{
            System.out.println("c is the biggest integer with value "+c);
        }

    }

    public static void main(String[] args) {
        // if_condition();
        // if_else_condition();
        nested_if_else_condition();
    }
    
}
