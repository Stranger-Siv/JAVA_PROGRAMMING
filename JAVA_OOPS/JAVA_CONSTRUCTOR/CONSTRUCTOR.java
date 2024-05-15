// JAVA CONSTRUCTOR

package JAVA_OOPS.JAVA_CONSTRUCTOR;

class A {
    int a;
    String name;

    A() {
        a = 0;
        name = null;
    }
    void show(){
        System.out.println(a+" "+name);
    }
}

class CONSTRUCTOR{
    public static void main(String[] args) {
        A ref = new A();
        ref.show();
    }   
}
