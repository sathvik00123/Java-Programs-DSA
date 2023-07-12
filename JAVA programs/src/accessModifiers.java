

import java.util.*;

class modifiers{
    private int id,phone,age;
    protected String name = "keerthan";
    public int rollno,gender;            ////  this public can be used any where...
    public modifiers(int id,int phone,int age){
        this.id = id;
        this.phone = phone;
        this.age = age;
        System.out.println(id+", "+phone+", "+age);
    }
    public modifiers(String name){
        this.name = name;
    }
}

class allowAccess extends modifiers{
    public allowAccess(int id,int phone,int age){
        super(id,phone,age);
    }
}

class accessModifiers{
    public static void main(String args[]){
        allowAccess s1 = new allowAccess(12,43423,20);
        // System.out.println(s1.id+", "+s1.phone+", "+s1.age);         /// they are private, so can't be accessable.
        System.out.println(s1.name);
        modifiers m1 = new modifiers("sathvik");
        System.out.println(m1.name);
    }
}