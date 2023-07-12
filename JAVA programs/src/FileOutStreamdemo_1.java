import java.io.*;
import java.util.Scanner;
public class FileOutStreamdemo_1 {
    public static void main(String args[]){
        try{
            String st;
            byte[] b = new byte[10];
            System.out.println("Enter some text : ");
            Scanner s = new Scanner(System.in);
            st = s.nextLine();
            b = st.getBytes();
            System.out.println("the length of string : " + b.length);
            OutputStream i = new FileOutputStream("MyFirstFile.txt");
            i.write(b);
            i.close();
        }
        catch(Exception e){
            
        }
    }
}
