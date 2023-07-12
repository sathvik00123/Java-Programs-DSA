import java.util.*;
public class call_by_value {

    static void swap(int aa,int bb){
        int t;
        t = aa;
        aa=bb;
        bb=t;
        System.out.println("in function a and b values <>-()-<>-()-<> ");
        System.out.println("a : " + aa);
        System.out.println("b : " + bb);
    }
    public static void main(String args[]){
        int a = 10,b = 20;
        System.out.println("Before swap <>-()-<>-()-<> ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
         
        swap(a,b);

        System.out.println("After swap <>-()-<>-()-<> ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

}
