import java.util.*;

class copy{
    int x,y;

    public copy(int x,int y){
        this.x = x;
        this.y = y;
    }

    copy (copy c1){
        x = c1.x;
        y = c1.y;
    }

    public String display(){
        return "(" + x + ", " + y + ")";
    }
}

class copy_construct{
    public static void main(String args[]){
        copy c1 = new copy(10,20);
        System.out.println(c1.display());
        // c1.x = 15;
        // System.out.println(c1.display());
        copy c2 = new copy(c1); 
        System.out.println(c2.display());
    }
}

