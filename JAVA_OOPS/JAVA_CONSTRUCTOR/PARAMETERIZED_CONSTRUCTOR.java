package JAVA_OOPS.JAVA_CONSTRUCTOR;

class C {

    int x, y;

    C(int a, int b) {
        x = a;
        y = b;
    }

    C(int a, String b) {
        System.out.println(a + " " + b);
    }

    void show() {
        System.out.println(x + " " + y);
    } 
}

public class PARAMETERIZED_CONSTRUCTOR {

    public static void main(String[] args) {
        C r = new C(100, 200);
        @SuppressWarnings("unused")
        C ref = new C(20, "Siv");
        r.show();
    }
}
