import java.util.*;

class constructor1{
    void show(){
        System.out.println("const1 called...");
    }
}
class constructor2 extends constructor1{
    @Override
    void show(){            /// Overiding concept...
        super.show();
        System.out.println("const2 called...");
    }
}

class SuperMethod{
    public static void main(String args[]){
        constructor2 c2 = new constructor2();
        c2.show();
    }
}