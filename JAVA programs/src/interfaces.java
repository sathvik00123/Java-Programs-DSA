interface Area{
    double pi = 3.14;
    double calculate(double x,double y);
}

class Rectangle implements Area{
    public double calculate(double x1,double y1){
        return (x1*y1);
    }
}

class Circle implements Area{
    public double calculate(double x2,double y2){
        return (pi*x2*x2);
    }
}

public class interfaces {
    public static void main(String args[]){
        Area a1 = new Rectangle();
        System.out.println("Area of rectangle : " + a1.calculate(24,6));

        Area a2 = new Circle();
        System.out.println("Area of Circle : " + a2.calculate(15,15));
    }
}
