package JAVA_BASICS;
import java.util.*;
public class JAVA_08_ARRAYS {
    public static void main(String[] args) {
        
        int [] marks =new int [5];
        marks[0]=100;
        marks[1]=90;
        marks[2]=65;
        marks[3]=75;
        marks[4]=98;

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);

        }

        // 2D Arrays
        
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter rows");
            int rows = sc.nextInt();
            System.out.println("Enter cols");
            int cols = sc.nextInt();
            int[][] numbers = new int [rows][cols];
            
            
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    numbers[i][j]=sc.nextInt();
                }
            }

            //output

            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    System.out.print(numbers[i][j]+" ");
                }
                System.out.println();
            }
                
            System.out.println("Enter x");
            int x =sc.nextInt();
            
             for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                   if(numbers[i][j]==x){
                        System.out.println("x found at position ("+ i + "," + j + ")" );
                   }
                }
            }
        }
        
    }
    
}
