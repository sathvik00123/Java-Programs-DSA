class class1{
    public void method(){
        System.out.println("This is the method of class1");
    }
}

class class2 extends class1{
    @Override
    public void method(){
        System.out.println("This is the method of class2");
        super.method();
    }
}


public class Overriding {
    public static void main(String args[]){
        class2 obj = new class2();
        obj.method();
    }
}
