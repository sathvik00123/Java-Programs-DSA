import java.util.Scanner;
class takeInput{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = obj.nextLine();
        // System.out.println(name);
        System.out.println("Enter the age : ");
        int age = obj.nextInt();
        // System.out.println(age);
        System.out.println("Enter the weight : ");
        double weight = obj.nextDouble();
        System.out.println("name : " + name + ", age : " + age + ", weight : " + weight);
        obj.close();
    }
}