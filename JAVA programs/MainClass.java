// package p5;
import p1.Add;
import p2.Sub;
import p3.Multi;             // not getting the access to use other packages from this package
import p4.Div;                      // code is written in other class named Mainclass. 

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainClass {
    public static void main(String args[]){
        
        Queue<Integer> q = new LinkedList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the choice : ");
        char select = scan.next().charAt(0);
        switch(select){
            case '+' :
                Add a = new Add();
                a.sum();
                break;
            case '-' :
                Sub s = new Sub();
                s.diff();
                break;
            case '*' :
                Multi m = new Multi();
                m.prod();
                break;
            case '/' :
                Div d = new Div();
                d.div();
                break;
            default:
                System.exit(0);
                break;
        }
    }
}
