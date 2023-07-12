class A{  // parent class
    String FName = "kamal";
    String MName = "rani";

    public void parentDetails(){
        System.out.println("Details are from class 'A'");
        System.out.println("STU Father Name : " + FName);
        System.out.println("STU Mother Name : " + MName);
    }
}

class B extends A{ // child class
    String SName = "Raghav";
    String Collage = "SNS";
    public void parentDetails(){
        System.out.println("Details are from class 'B'");
        System.out.println("STU Father Name : " + FName);
        System.out.println("STU Mother Name : " + MName);
    }
}


public class SingleInheritance {
    public static void main(String args[]){
        B object = new B();
        // System.out.println("Details of Student");
        // System.out.println("STU Name : " + object.SName);
        // System.out.println("STU Collage Name : " + object.Collage);
        object.parentDetails();

    }
}
