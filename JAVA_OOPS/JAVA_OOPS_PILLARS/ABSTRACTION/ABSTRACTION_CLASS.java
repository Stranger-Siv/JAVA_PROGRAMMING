package JAVA_OOPS.JAVA_OOPS_PILLARS.ABSTRACTION;


abstract class Subject {
    Subject() { 
      System.out.println("Learning Subject"); 
    }
   
      abstract void syllabus();
   
      void Learn(){
          System.out.println("Preparing Right Now!");
    }
}

class IT extends Subject {
    void syllabus(){
      System.out.println("C , Java , C++");
    }
  }

public class ABSTRACTION_CLASS {
    public static void main(String[] args) {
        Subject x=new IT();
       
          x.syllabus();
          x.Learn();
    }
}
