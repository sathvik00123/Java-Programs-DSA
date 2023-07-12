import java.util.*;
public class staticpublic{
    static void myfun1(){
        System.out.println("static fun doesn't need any obj creation.");
    }
    public void myfun2(){
        System.out.println("public fun needs an obj creation.");
    }
    public static void main(String args[]){
        myfun1();

        staticpublic myObj = new staticpublic();
        myObj.myfun2();
    }
}