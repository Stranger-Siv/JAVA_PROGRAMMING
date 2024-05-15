package JAVA_OOPS.JAVA_CONSTRUCTOR;

class D {

    int a;
    String b;

    D() {
        a = 10;
        b = "Sivram";
        System.out.println(a + " " + b);
    }

    D(D ref) {
        a = ref.a;
        b = ref.b;
        System.out.println(a + " " + b);
    }

    public class COPY_CONSTRUCTOR {
        public static void main(String[] args) {
            D r = new D();
            @SuppressWarnings("unused")
            D r2 = new D(r);
        }
    }
}
