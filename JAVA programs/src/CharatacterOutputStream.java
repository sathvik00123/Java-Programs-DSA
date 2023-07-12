import java.io.*;
import java.util.Scanner;
public class CharatacterOutputStream {
    public static void main(String args[])throws Exception{
        String st;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter some text into file :");
        st = s.nextLine();
        char buffer[] = new char[st.length()];
        st.getChars(0, st.length(), buffer, 0);
        FileWriter f = new FileWriter("C:/Users/Dell/OneDrive/Desktop/java program files/JAVA programs/src/FirstDemoFile_1.txt");
        for(int i=0;i<st.length();i++){
            f.write(buffer[i]);
        }
        f.close();
    }
}
