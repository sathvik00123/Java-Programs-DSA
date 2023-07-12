public class array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
          System.out.println(cars[i]);
        }
        String[] bikes = {"yamaha","tvs-apache","dueke","honda"};
        for(String i : bikes){
            System.out.println(i);
        }
      }    
}
