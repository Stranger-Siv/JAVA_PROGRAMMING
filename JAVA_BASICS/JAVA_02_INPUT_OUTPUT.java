package JAVA_BASICS;
import java.util.Scanner;

public class JAVA_02_INPUT_OUTPUT {

    int a = 10;
    static double b = 20.5;

    public static void main(String[] args) {
        boolean c = true;

        JAVA_02_INPUT_OUTPUT s = new JAVA_02_INPUT_OUTPUT();
        System.out.println(s.a);
        System.out.println(b);
        System.out.println(c);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of a :");
            int a = sc.nextInt();
            System.out.println("Enter value of b :");
            int b = sc.nextInt();
            int sum = a + b;

            System.out.println("Sum of a and b is :" + sum);
        }

    }
}