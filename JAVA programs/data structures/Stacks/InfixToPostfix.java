import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix expression : ");
        String str = sc.nextLine();  // a*b/(d+c)*e
        System.out.println(convertInfixToPostfix(str));

        sc.close();
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
