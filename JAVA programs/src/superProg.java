import java.util.*;

class superClass{
    int i;
    int a;
    String b;
    float c;
    superClass(){
        System.out.println("this is a super class...");
    }
    superClass(int num,String name,float tax){
        a = num;
        b = name;
        c = tax;
    }
    public void display(){
        System.out.println("i : " + i);
        System.out.println("num : " + a);
        System.out.println("name : " + b);
        System.out.println("tax : " + c);
    }
}

public class superProg extends superClass{
    superProg(int aa,String bb,float cc){
        super(aa,bb,cc);
        super.i=10;
        super.display();
        System.out.println("this is a sub class...");
    }
    
    static void method(){
        System.out.println("this worked");
    }
    
    public static void main(String args[]){
        superProg obj = new superProg(12,"sathvik",144.53f);
        obj.method();
    }
}