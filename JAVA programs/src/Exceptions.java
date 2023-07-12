import java.util.Scanner;

public class Exceptions {
    public static void main(String args[]){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the choice ");
            int select = s.nextInt();

            switch(select){
                // ArrayOutOfBoundsException
                case 1:
                    int arr[] = new int[5];
                    System.out.println(arr[5]);
                    break;
                // ArithmeticException
                case 2:
                    int num1 = 20,num2 = 0;
                    System.out.println(num1/num2);
                    break;
                // NullPointerException
                case 3:
                    String str = null;
                    System.out.println(str.length());
                    break;
            }
        }
        catch(ArithmeticException e1){
            System.out.println("Exception thrown "+e1);
        }
        catch(NullPointerException e2){
            System.out.println("Exception thrown "+e2);
        }
        catch(ArrayIndexOutOfBoundsException e3){
            System.out.println("Exception thrown "+e3);
        }
        System.out.println("Out of the block...");
    }
}
