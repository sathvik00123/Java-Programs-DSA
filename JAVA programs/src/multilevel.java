import java.util.*;

class college{
    String CN;
    String DN;
    college(){
        CN = "Sathyabama";
        DN = "CSE";
    }
    void dis(){
        System.out.println(CN+"\n"+DN);
    }
}

class dept extends college{
    String sname;
    int regno;
    String year;

    dept(){
        super();
        sname = "ram";
        regno = 392;
        year = "II";
    }
    void dis1(){
        System.out.println(sname+"\n"+regno+"\n"+year);
    }
}

class student extends dept{
    int tot;
    float avg;
    int mark[]=new int[6];
    Scanner s = new Scanner(System.in);

    void cal(){
        System.out.println("marks input : ");
        for(int i=0;i<mark.length;i++){
            mark[i] = s.nextInt();
            tot = tot+mark[i];
        }
        avg = tot/mark.length;
        s.close();
    }

    void dis2(){
        System.out.println(tot+"\n"+avg);
    }
}

public class multilevel{
    public static void main(String args[]){
        // dept d1 = new dept();
        student s1 = new student();
        s1.dis();
        s1.dis1();
        s1.cal();
        s1.dis2();
    }
}