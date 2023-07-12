import java.io.*;
public class CharacterInputStream {
    public static void main(String args[])throws Exception{
        int ch;
        FileReader fr = new FileReader("C:/Users/Dell/OneDrive/Desktop/java program files/JAVA programs/src/FirstDemoFile_1.txt");
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
