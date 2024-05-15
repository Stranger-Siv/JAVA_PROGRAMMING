// JAVA DEFAULT CONSTRUCTOR

package JAVA_OOPS.JAVA_CONSTRUCTOR;

class B {
    int a;
    String b;
    boolean c;

    B() {
        a = 100;
        b = "ankit";
        c = true;
    }

    void disp() {
        System.out.println(a + " " + b + " " + c);
    }
}

class DEFAULT_CONSTRUCTOR {
    public static void main(String[] args) {
        B ref = new B();
        ref.disp();
    }
}
