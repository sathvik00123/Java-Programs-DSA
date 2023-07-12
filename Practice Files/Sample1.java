import java.util.Scanner;
 class Sample1 {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the values : ");
        // String str = sc.nextLine();
        // int val = sc.nextInt();
        // double variable = sc.nextDouble();
        // System.out.println("Numbers after taking input:");
        // System.out.println(str);
        // System.out.println(val);
        // System.out.println(variable);

        /// Loops

        /// for, while, do while, forEach

        int array[] = {23,34,12,56,12,76,21,56,19}; // len = 6

        System.out.println("Array length : "+array.length);

        // for(int idx = 0;idx < arr.length;idx++){  //  idx = 9 ==> arr[9]
        //     System.out.println(idx +" "+ arr[idx]);
        // }
        
        // int idx = 0;
        // while(idx < array.length){
        //     System.out.println(idx +"-->"+ array[idx]);
        //     idx = idx + 1; // 9
        // }

        for(int value : array){
            System.out.println(value);
        }


        
        // myFunction();
    }

    static void myFunction(){
        int a = 12;
        int b = 13;
        System.out.println(a+b);
    }
}

