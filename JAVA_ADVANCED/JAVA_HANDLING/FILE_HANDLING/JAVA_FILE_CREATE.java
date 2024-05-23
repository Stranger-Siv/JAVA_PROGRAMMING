package JAVA_ADVANCED.JAVA_HANDLING.FILE_HANDLING;

import java.io.File;
import java.io.IOException;

public class JAVA_FILE_CREATE {
    public static void main(String[] args) {
        File f = new File("/Users/siv/Desktop/LC.txt");
        try{
            if(f.createNewFile()){
                System.out.println("File Successfully Created");
            }else{
                System.out.println("File Already Exist");
            }
        }
        catch(IOException i){
            System.out.println("Exception Handled");
        }
    }
}
