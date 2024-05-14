package JAVA_BASICS;
import java.util.*;
public class JAVA_06_CONTROL_FLOW {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            /*
            if(i==5){
                break;
            }
            */
            if(i==8){
                continue;
            }
            System.out.print(i+" ");
        }
        
        try (Scanner sc = new Scanner (System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter ur choice");
            int ch=sc.nextInt();
            int c;

            switch (ch) {
                case 1:
                    c=a+b;
                    System.out.println(c);
                    break;
                case 2:
                    c=a-b;
                    System.out.println(c);    
                    break;
                default:
                    break;
            }
        }

    }

}
