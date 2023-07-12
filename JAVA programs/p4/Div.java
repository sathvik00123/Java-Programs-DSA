package p4;
import java.util.Scanner;

public class Div {
        public void div(){
        try{  
            //Scanner s1 = new Scanner(System.in);
            //System.out.println("enter the number : ");
            //int x = s1.nextInt();
            //int y = s1.nextInt();
            int x=35;
            int y=7;
            System.out.println("div : " + (x/y));
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong "+ e);
        }
    }
}
