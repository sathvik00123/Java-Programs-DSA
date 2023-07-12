abstract class myclass1{
    abstract void myfun();

    public void myfunction(){
        System.out.println("this is a function from myclass1.");
    }
}

class myclass2 extends myclass1{
    void myfun(){
        System.out.println("this is an abstract function of myclass1 which inherited by myclass1.");
    }
}

class abstraction{
    public static void main(String args[]){
        // myclass1 obj1 = new myclass1(); /// this produces error due to, class is abstract...
        // obj1.myfunction();
        // obj1.myfun();
        myclass2 obj = new myclass2();
        obj.myfun();
        // obj.myfunction();
        // System.out.println(obj.myfun());
    }
}







// interface Animal {
//   public void animalSound(); // interface method (does not have a body)
//   public void sleep(); // interface method (does not have a body)
// }

// // Pig "implements" the Animal interface
// class Pig implements Animal {
//   public void animalSound() {
//     // The body of animalSound() is provided here
//     System.out.println("The pig says: wee wee");
//   }
//   public void sleep() {
//     // The body of sleep() is provided here
//     System.out.println("Zzz");
//   }
// }

// class abstraction{
//   public static void main(String[] args) {
//     Pig myPig = new Pig();  // Create a Pig object
//     myPig.animalSound();
//     myPig.sleep();
//   }
// }






// interface FirstInterface {
//   public void myMethod(); // interface method
// }

// interface SecondInterface {
//   public void myOtherMethod(); // interface method
// }

// class DemoClass implements FirstInterface, SecondInterface {
//   public void myMethod() {
//     System.out.println("Some text..");
//   }
//   public void myOtherMethod() {
//     System.out.println("Some other text...");
//   }
// }

// class abstraction {
//   public static void main(String[] args) {
//     DemoClass myObj = new DemoClass();
//     myObj.myMethod();
//     myObj.myOtherMethod();
//   }
// }