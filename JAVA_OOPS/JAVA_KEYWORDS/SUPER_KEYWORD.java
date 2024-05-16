package JAVA_OOPS.JAVA_KEYWORDS;

class A {

    // int a = 10;
    // void show(){
    //     System.out.println("Hello Viewer");
    // }

    A(){
        System.out.println("Hello Viewer");
    }
}

class B extends A {

    B(){
        //super() {In term of constructor by default the super keyword is attached by compiler}

        System.out.println("Hello Listner");
    }

    // int a = 20;

    // void show() {
    //     super.show();
    //     // System.out.println(a);
    //     // System.out.println(super.a);
    //     System.out.println("Hello Listner");
    // }

}

public class SUPER_KEYWORD {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        B r = new B();
        // r.show();
    }
}
