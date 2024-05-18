package JAVA_OOPS.JAVA_OOPS_PILLARS.INHERITANCE;

class One {
    public void print_geek() {
        System.out.println("Hello");
    }
}

class Two extends One {
    public void print_for() {
        System.out.println("Sivram");
    }
}

class Three extends Two {
    public void print_lastgeek() {
        System.out.println("Pradhan");
    }
}

public class MULTI_LEVEL_INHERITANCE {
    public static void main(String[] args) {
        // Creating an object of class Three
        Three g = new Three();
        
        // Calling method from class One
        g.print_geek();
        
        // Calling method from class Two
        g.print_for();
        
        // Calling method from class Three
        g.print_lastgeek();
    }
}
