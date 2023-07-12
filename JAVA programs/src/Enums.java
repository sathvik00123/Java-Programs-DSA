public class Enums {
  enum Level {
    low,
    MEDIUM,
    HigH
  }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);

    for(Level myvar : Level.values()){
        System.out.println(myvar);
    }
  }
}