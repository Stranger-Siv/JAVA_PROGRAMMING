package JAVA_BASICS;
public class JAVA_05_LOOPS {

    public static void for_loops(){

        for(int i=1;i<=10;i++){
            System.out.print(i);
            System.out.print(" ");
        }

    }

    public static void while_loop(){

        int i=0;
        while(i<=10){
            System.out.print(i);
            i++;
            System.out.print(" ");
        }
    }

    public static void do_while_loop(){

        int i=0;
        do{
            System.out.print(i);
            i++;
            System.out.print(" ");
        }
        while(i<=5);

    }
    
    public static void main(String[] args) {
        for_loops();
        System.out.println();
        while_loop();
        System.out.println();
        do_while_loop();
    }
}
