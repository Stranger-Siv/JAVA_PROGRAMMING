package JAVA_ADVANCED.JAVA_HANDLING.FILE_HANDLING;

import java.io.*;

public class JAVA_FILE_UPDATE {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("/Users/siv/Desktop/LC1.txt");
            try{
                f.write("Hello Sivram Pradhan. How are You?");
            }
            finally{
                f.close();
            }
            System.out.println("Successfully Data wrote in file");
        }
        catch(IOException i){
            System.out.println("Exception handled successfully");
        }
    }
}

