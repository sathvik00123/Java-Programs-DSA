import java.util.*;
public class sample {
    static public void main(String[] args) {   
        int num = 90; 
        String s = num+"";
        int leastNum = getLeastNum(num);
        String max = s, min = s;
        String ch = leastNum+"";
        System.out.println(ch);
        System.out.println(max);
        System.out.println(min);
        
        // for max number...

        String str1 = "";
        for(int i=0;i<max.length();i++){
            String str = max.charAt(i)+"";
            System.out.println(str);
            if(ch.equals(str)){
                str1 = max.replace(max.charAt(i),'9');
                System.out.println(str1);
                break;
            }
        }
        
        
        // for min number...

        String str2 = "";
        for(int i=0;i<min.length();i++){
            String str = max.charAt(i)+"";
            System.out.println(str);
            if(ch.equals(str)){
                str2 = min.replace(min.charAt(i),'0');
                System.out.println(str2);
                break;
            }
        }
        int newMax = Integer.parseInt(str1);
        int newMin = Integer.parseInt(str2);
        System.out.println(newMax - newMin);
    }
    
    static private int getLeastNum(int n){
        int min = Integer.MAX_VALUE;
        while(n != 0){
            int rem = n%10;
            if(min >= rem){
                min = rem;
            }
            n = n/10;
        }
        return min;
    }
}
