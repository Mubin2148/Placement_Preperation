import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
       String file = "Problem8.java";
       String targetFile = "code.txt";
       
       try(FileInputStream fis = new FileInputStream(file);
       FileOutputStream fos = new FileOutputStream(targetFile)
       ){
        byte[] buffer = new byte[1024];
        int length;

        while((length = fis.read(buffer))>0){
            fos.write(buffer,0,length);
        }
        System.out.println("Done");
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
    }
}
