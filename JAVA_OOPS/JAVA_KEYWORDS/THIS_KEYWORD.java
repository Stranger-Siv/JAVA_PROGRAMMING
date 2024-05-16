package JAVA_OOPS.JAVA_KEYWORDS;

public class THIS_KEYWORD {
    int a;

    public THIS_KEYWORD() {
        // System.out.println("Hello Sivram");
        this(10);
    }
    
    THIS_KEYWORD(int a){
        // a=a;
        // this.a=a;
        // this();
        System.out.println(a);
    }
    // void show() {
    //     System.out.println(a);
    //     // System.out.println(this);
    // }
    public static void main(String[] args) {
        THIS_KEYWORD r = new THIS_KEYWORD();
        // THIS_KEYWORD r = new THIS_KEYWORD(100);
        System.out.println(r);
        // r.show();
    }
}
