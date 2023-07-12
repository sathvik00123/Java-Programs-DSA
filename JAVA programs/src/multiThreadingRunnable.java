class threadClass1 implements Runnable{
    public void run(){
        for(int i=1;i<4;i++){
            System.out.println("this is thread 1");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}

class threadClass2 implements Runnable{
    public void run(){
        for(int i=1;i<4;i++){
            System.out.println("this is thread 2");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}

public class multiThreadingRunnable {
    public static void main(String args[]){
        // Runnable obj1 = new threadClass1();
        // Runnable obj2 = new threadClass2();
        threadClass1 obj1 = new threadClass1();
        threadClass2 obj2 = new threadClass2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try{
            Thread.sleep(10);
        }catch(Exception e){}
        t2.start();
}
}
    

