import java.util.*;

class A{
    public A(){
        System.out.println("const A");
    }
    public A(int i){
        System.out.println("const A with para.");
        System.out.println("value of i : " + i);
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("const B");
    }
    public B(int i){
        super(i);
        System.out.println("const B with para.");
        System.out.println("value of i : " + i);
    }
}

class supermethod1{
    public static void main(String args[]){
        B s1 = new B();
        B s2 = new B(100);
    } 
}

