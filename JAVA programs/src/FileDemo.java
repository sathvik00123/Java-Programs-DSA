import java.io.*;
public class FileDemo {
    public static void main(String args[]){
        int size;
        try{
            InputStream is = new FileInputStream("C:/Users/Dell/OneDrive/Desktop/java program files/JAVA programs/src/MyFirstFile.txt");
            System.out.println("file is available");
            size = is.available();
            System.out.println("size " + size);
            is.mark(10);
            for(int i=0;i<25;i++){
                System.out.print((char)is.read());
            }
            is.close();
        } 
        catch(Exception e){
            System.out.println(e);
        }
    }
}
