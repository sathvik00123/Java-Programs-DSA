import java.util.*;
class area{
    area(){
        System.out.print("area of the rectangle: ");
    }
    void dis(int length,int breadth){
        float rec=(length*breadth);
        System.out.println(rec);
    }
    area(int side){
        float squ=side*side;
        System.out.println("area of square : "+squ);
    }
    area(float base,float height){
        double tri=0.5*base*height;
        System.out.println("area of triangle: "+tri);
    }
}

class square extends area{
    square(int si){
        super(si);
    }
}
class triangle extends area{
    triangle(float ba,float hi){
        super(ba,hi);
    }
}
class rectangle extends area{
    rectangle(int le,int br){
        super.dis(le,br);
    }
}
class superKeyword{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the side value of square: ");
       int s=sc.nextInt();
       square obj1 =new square(s); 
       System.out.println("enter the value of triangle: ");
       float g=sc.nextFloat();
       float g1=sc.nextFloat();
       triangle obj2 =new triangle(g,g1); 
       System.out.println("enter the value of side of rectangle: ");
       int f=sc.nextInt();
       int f1=sc.nextInt();
       rectangle obj3 =new rectangle(f,f1); 
    }
}
    
