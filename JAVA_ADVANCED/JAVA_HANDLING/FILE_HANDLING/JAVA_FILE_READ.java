package JAVA_ADVANCED.JAVA_HANDLING.FILE_HANDLING;

import java.io.FileReader;
import java.io.IOException;

public class JAVA_FILE_READ {
    public static void main(String[] args) {
        try{
            FileReader r = new FileReader("/Users/siv/Desktop/LC1.txt");
            try{
                int i;
                while((i=r.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                r.close();
            }
        }
        catch(IOException i){
            System.out.println("Exception Handled");
        }
    }
}
