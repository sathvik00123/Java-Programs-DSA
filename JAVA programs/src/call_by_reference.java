class Obj{
    int a,b;

    public void set_values(int aa,int bb){
        a=aa;
        b=bb;
    } 

    public static void swap(Obj t){
        int temp;
        temp = t.a;
        t.a = t.b;
        t.b = temp;
    }

    public  void  display(){
        System.out.println("a : "+ a + "\nb : "+ b);
    }
}

class call_by_reference {
    public static void main(String args[]){
        Obj p = new Obj();
        p.set_values(20,90);
        System.out.println("Before calling swap() method ");
        p.display();

        Obj.swap(p);  ///  this is the important step to be followed....

        System.out.println("After calling swap() method ");
        p.display();
    }    
}
