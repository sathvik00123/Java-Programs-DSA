class a{
    int id_no;
    String name;

    public void studentInfo(int id_no,String name){
        this.id_no = id_no;
        this.name = name;
        display();
    }

    public void display(){
        System.out.println("ID Number : "+id_no);
        System.out.println("student name : "+name);
    }
}

public class classObj {
    static void outDisplay1(){
        a stud2 = new a();
        stud2.name = "sathvikeethan";
        stud2.id_no = 24;
        stud2.display();
        stud2.studentInfo(24,"sathvikeerthan");
    }

    static void outDisplay2(int id_no,String name){
        System.out.println("ID number : "+ id_no);
        System.out.println("student name : "+ name);
        // stud1.display();
    }
    public static void main(String args[]){
        a stud1 = new a();
        stud1.name = "sathvik";
        stud1.id_no = 34;
        stud1.display();
        stud1.studentInfo(34,"sathvik");
        outDisplay1();
        outDisplay2(stud1.id_no,stud1.name);
    }
}


