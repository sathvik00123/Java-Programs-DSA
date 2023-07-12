import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix expression : ");
        String str = sc.next();  // a*b/(d+c)*e
        char[] ch1 = str.toCharArray();
        reverseString(ch1);
        String postStr = convertInfixToPostfix(ch1.toString());
        char[] ch2 = postStr.toCharArray();
        reverseString(ch2);
        System.out.println(ch2.toString());
        sc.close();
    } 
    
    private static void reverseString(char[] c){
        int i=0,j=c.length-1;
        while(i<j){
            char temp = (char)c[i];
            c[i++] = (char)c[j];
            c[j--] = (char)temp;
        }
    }

    private static String convertInfixToPostfix(String str){
        String newStr = "";
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                s.push(str.charAt(i));
            }else if(str.charAt(i) == ')'){
                while(s.peek() != '('){
                    newStr += s.pop();          
                }
                s.pop();
            }else if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/'){
                if(s.isEmpty()){
                    s.push(str.charAt(i));
                }else{
                    if(str.charAt(i) == '+'){
                        while(!s.isEmpty() && (s.peek() == '*' || s.peek() == '/' || s.peek() == '-')){
                            newStr += s.pop();
                        }
                        s.push('+');
                    }
                    else if(str.charAt(i) == '-'){
                        while(!s.isEmpty() && (s.peek() == '*' || s.peek() == '/' || s.peek() == '+')){
                            newStr += s.pop();
                        }
                        s.push('-');
                    }else if(str.charAt(i) == '*'){
                        if(s.peek() == '+' || s.peek() == '-' || s.peek() == '*'){
                            s.push(str.charAt(i));
                        }else{
                            while(!s.isEmpty() && s.peek() == '/'){
                                newStr += s.pop();
                            }
                            s.push(str.charAt(i));
                        }
                    }else if(str.charAt(i) == '/'){
                        if(s.peek() == '+' || s.peek() == '-' || s.peek() == '/'){
                            s.push(str.charAt(i));
                        }else{
                            while(!s.isEmpty() && s.peek() == '*'){
                                newStr += s.pop();
                            }
                            s.push(str.charAt(i));
                        }
                    }
                    
                }
            }else{
                newStr += str.charAt(i);
            }
        }
        while(!s.isEmpty()){
            newStr += s.pop();
        }
        return newStr;
    }
}
