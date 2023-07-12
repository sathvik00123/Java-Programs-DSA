import java.util.*;

class manager{
    String name;
    int phone;
    int id;
    manager(String nameEmp,int phoneEmp,int idEmp){
        name = nameEmp;
        phone = phoneEmp;
        id = idEmp;
    }
}

class employee extends manager{
    employee(String nameEmp,int phoneEmp,int idEmp){
        super(nameEmp,phoneEmp,idEmp);
    }
}

public class singleInheritance{
    public static void main(String args[]){
        employee e1 = new employee("ram",233234,12332);
        System.out.println(e1.name+"\n"+e1.phone+"\n"+e1.id);
    }
}