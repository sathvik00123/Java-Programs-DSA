import java.util.*;
// import java.util.Scanner;
class myclass{
    int m,count,sum,rem;
    myclass(){
        count = 0; sum = 0; 
    }
    void armMethod(int number){
        // int temp = number;
        m = number;
        while(m != 0){
            m = m/10;
            count++;
        }
        int i = 0;
        m = number;
        while(i < count){
            rem = m % 10;
            sum += Math.pow(rem,count);
            m = m/10;
            if(m == 0){
                break;
            }
            i++;
        }
        if(number == sum){
            System.out.print("it's an armstrong number with value ");
            System.out.println(sum);
        }
        else{
            System.out.print("it's not an armstrong number with value ");
            System.out.println(sum);
        }
    }
}

class armstrong_number{
    public static void main(String args[]){
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        myclass arm1 = new myclass(); 
        arm1.armMethod(number);
    }
}