class threadClass1 extends Thread{
    public void run(){
        for(int i=1;i<4;i++){
            System.out.println("this is thread 1");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}

class threadClass2 extends Thread{
    public void run(){
        for(int i=1;i<4;i++){
            System.out.println("this is thread 2");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}
public class multiThreading {
    public static void main(String args[]){
            threadClass1 obj1 = new threadClass1();
            threadClass2 obj2 = new threadClass2();
            obj1.start();
            // try{
            //     Thread.sleep(10);
            // }catch(Exception e){}
            obj2.start();
    }
}
