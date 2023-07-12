
public class Cloning implements Cloneable {
    int x;
    int y;

    Cloning(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){    
        return "Cloning (" + " X : " + x + " , Y : " + y + ")";
    }
    // public Object clone()throws CloneNotSupportedException{
    //     return super.clone();
    // }
    public static void main(String args[]) throws CloneNotSupportedException{
        /// clonning = shallow copy + deep copy
        
        Cloning c1 = new Cloning(10, 20);
        Cloning c2 = (Cloning) c1.clone();
        System.out.println(c1);
        System.out.println(c2);
        c2.x = 45;
        System.out.println(c2);
        System.out.println(c1);

        System.out.println(c2.hashCode());
        System.out.println(c1.hashCode());
    }
}

