package JAVA_OOPS.JAVA_OOPS_PILLARS.INHERITANCE;

interface One {
    public void print_hello();
}

interface Two {
    public void print_sivram();
}

interface Three extends One, Two {
    public void print_hello();
}

class Child implements Three {
    @Override
    public void print_hello() {
        System.out.println("Hello");
    }

    public void print_sivram() {
        System.out.println("Sivram");
    }
}

public class MULTIPLE_INHERITANCE {
    public static void main(String[] args) {
        Child c = new Child();
        c.print_hello();
        c.print_sivram();
        c.print_hello();
    }
}
