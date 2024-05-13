package JAVA_BASICS;
public class JAVA_03_OPERATOR {

    public static void Arithmetic_Operator() {
        int a = 10;
        int b = 5;

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("Sum=" + sum);
        System.out.println("Sub=" + sub);
        System.out.println("Mul=" + mul);
        System.out.println("Div=" + div);
        System.out.println("Mod=" + mod);
    }

    public static void Unary_Operator() {
        int n1 = 20; // NEGATIVE OPERATOR
        n1 = -n1;
        System.out.println(n1);

        int n2 = 8; // NEGATIVE OPERATOR
        int n3 = 9;
        if (n2 != n3) {
            System.out.println("true");
        }

        int n4 = 10; // INCREMENT OPERATOR
        System.out.println(n4);
        n4++;
        System.out.println("After increment:" + n4);

        int n5 = 10; // DECREMENT OPERATOR
        System.out.println(n5);
        n5--;
        System.out.println("After Decrement:" + n5);

    }

    public static void Assignment_Operator() {
        int n1 = 10;
        int n2 = 5;
        n1 += n2; // addition assignment
        System.out.println("Add Ass :" + n1);
        n1 -= n2; // subtraction assignment
        System.out.println("Sub ass :" + n1);
        n1 *= n2; // multiplication assignment
        System.out.println("Mul ass :" + n1);
        n1 /= n2; // division assignment
        System.out.println("Div ass :" + n1);
        n1 %= n2; // modulus assignment
        System.out.println("Mod ass :" + n1);

    }

    public static void Relational_Operator() {
        int n1 = 20;
        int n2 = 15;

        System.out.println((n1 == n2));

        int n3 = 5;
        int n4 = 6;

        System.out.println((n3 != n4));

        int n5 = 5;
        int n6 = 6;
        int n7 = 5;
        int n8 = 9;

        System.out.println((n5 > n6));
        System.out.println((n5 < n6));
        System.out.println(n5 >= n7);
        System.out.println(n6 <= n8);
    }

    public static void Logical_Operator() {

        int a = 5;
        int b = 20;
        int c = 20;
        int d = 0;

        if ((a < b) && (b == c)) { // And Operator
            d = a + b + c;
            System.out.println(d);
        }

        if ((a < b) || (b > c)) { // Or Operator
            d = a + b - c;
            System.out.println(d);
        }

        System.out.println(!(a < b)); // Not Operator
        System.out.println(!(a > b));

    }

    public static void Ternary_Operator() {
        int a = 5;
        int b = 6;
        int max;

        max = (a > b) ? a : b;
        System.out.println(max);
    }

    public static void main(String[] args) {
        // Arithmetic_Operator();
        // Unary_Operator();
        // Assignment_Operator();
        // Relational_Operator();
        // Logical_Operator();
        // Ternary_Operator();

    }
}