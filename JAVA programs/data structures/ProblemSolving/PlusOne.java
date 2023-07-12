import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

// package data structures.ProblemSolving;

public class PlusOne {
    public static void main(String args[]){
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        long num = 0;
       for(int i=0;i<arr.length;i++){
           num += arr[i]*Math.pow(10,arr.length-i-1);
       }
       num = num + 1;
       String str = Long.toString(num);
       int len = str.length();
       int[] newArr = new int[len];
       num = Long.parseLong(str);
       System.out.println(num);
       int idx = 0;
       while(num != 0){
            newArr[idx] = (int) (num%10);
            num = num/10;
            idx++;
       }
    
    for(int i=0;i<len/2;i++){
        int temp = newArr[i];
        newArr[i] = newArr[len-1-i];
        newArr[len-1-i] = temp;
    }
    for(int i=0;i<len;i++){
        System.out.print(newArr[i]+" ");
       }
       System.out.println("\n"+len);
    }
}
