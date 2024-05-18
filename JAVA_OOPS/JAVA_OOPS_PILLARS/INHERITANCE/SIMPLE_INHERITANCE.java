package JAVA_OOPS.JAVA_OOPS_PILLARS.INHERITANCE;

class Employee {
    int salary = 60000;
}

class Engineer extends Employee {
    int benefits = 10000;
}

public class SIMPLE_INHERITANCE {
    public static void main(String args[])
    {
        Engineer E1 = new Engineer();
        System.out.println("Salary : " + E1.salary
                           + "\nBenefits : " + E1.benefits);
    }
}
