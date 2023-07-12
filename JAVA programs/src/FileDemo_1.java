import java.io.*;

public class FileDemo_1 {
    public static void main(String args[]){
        try{
            InputStream is = new FileInputStream("C:/Users/Dell/OneDrive/Desktop/java program files/JAVA programs/src/MyFirstFile.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            for(byte b:buffer){
                char c = (char) b;
                System.out.print(c);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
