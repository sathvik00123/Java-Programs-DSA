public class widening_narrowing{
    public static void main(String[] args){
        
        // widening..
        int num = 123;
        double changeNum = num;
        System.out.print("integer number: ");
        System.out.println(num);
        System.out.print("double number: ");
        System.out.println(changeNum);

        // narrowing...
        double num1 = 1423.91239d;
        int changenum1 = (int) num1;
        System.out.println("double number: " + num1);
        // System.out.println(num1);
        System.out.print("integer number: ");
        System.out.println(changenum1);
    } 
}