class Car{
    String color;
    int model;
    int seats;

    void add(String color,int model){
        this.color = color;
        this.model = model;
    }
    void add(int seats){
        this.seats = seats;
    }
    void printDetails(){
        System.out.println("color "+color);
        System.out.println("model "+model);
        System.out.println("seats "+seats);
    }
}


public class polymorphism{
    public static void main(String args[]){
        Car BMW = new Car();
        BMW.add("Red",2023);
        BMW.add(5);

        BMW.printDetails();
    }
}