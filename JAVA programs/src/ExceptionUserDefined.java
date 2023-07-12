class ExceptionClass extends Exception {
    public ExceptionClass(String msg){
        super(msg);
    }
}

public class ExceptionUserDefined {
    public static void main(String args[])throws Exception{
        ExceptionUserDefined c = new ExceptionUserDefined();
        c.display();
    }

    public void display()throws ExceptionClass{
        for(int i = 8;i>0;i--){
            System.out.println("i = "+i);
            if(i==7){
                throw new ExceptionClass("This is my own custom msg");
            }
        }
        
    }
}
