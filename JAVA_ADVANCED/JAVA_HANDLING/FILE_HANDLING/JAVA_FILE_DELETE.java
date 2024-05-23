package JAVA_ADVANCED.JAVA_HANDLING.FILE_HANDLING;
import java.io.File;
public class JAVA_FILE_DELETE {
    public static void main(String[] args) {
        File f =new File("/Users/siv/Desktop/LC.txt");
        if(f.delete()){
            System.out.println("Deleted the file"+ f.getName());
        }
        else{
            System.out.println("Failed to delete the file");
        }
    }
}
