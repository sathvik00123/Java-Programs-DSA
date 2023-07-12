import java.util.*;
class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class inheritance extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    inheritance myFastCar = new inheritance();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    
    Vehicle obj = new Vehicle();
    System.out.println(obj.brand);
  }
}