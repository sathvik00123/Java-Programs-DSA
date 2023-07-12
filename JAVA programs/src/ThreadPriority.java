class PrintPriority extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class ThreadPriority {
    public static void main(String args[]){
        PrintPriority obj1 = new PrintPriority();
        PrintPriority obj2 = new PrintPriority();
        PrintPriority obj3 = new PrintPriority();
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(5);
        obj3.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
