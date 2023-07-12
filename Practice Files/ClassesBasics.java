import java.util.*;
class Student{
    int id; 
    String name;  
    int grade;
    String collageName;

    // constructor
    Student(int ID,String NAME,int GRADE,String COLLAGENAME){
        id = ID;
        name = NAME;
        grade = GRADE;
        collageName = COLLAGENAME;
    }

    
}

class ClassesBasics{
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int ID = input.nextInt();
        String NAME = input.next();
        int GRADE = input.nextInt();
        String COLLAGENAME = input.next();

        Student raju = new Student(ID,NAME,GRADE,COLLAGENAME);
        System.out.println("Name : " + raju.name);
        System.out.println("Collage : " + raju.collageName);

        Student sathvik = new Student(123,"Sathvik",3,"Sathyabama");
        Student keerthan = new Student(234,"Keerthan",2,"Githam");
        Student Rafi = new Student(345,"Rafi",3,"IIIT");

        // System.out.println(sathvik.collageName); // "Sathyabama"
        // System.out.println(keerthan.collageName); 
        // System.out.println(Rafi.collageName); 


        // int array1[] = new int[100];

        // List<Integer> list = new ArrayList<Integer>();
        
        myFunction();


        input.close();
    }
}
