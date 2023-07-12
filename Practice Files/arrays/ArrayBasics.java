import java.util.*;
public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = new int[5];   //Static Array

        Scanner sc = new Scanner(System.in);

        // for(int i=0;i<5;i++){  // i = 5
        //     arr[i] = sc.nextInt();  // 40
        // }

        // for(int i=0;i<5;i++){  // i = 5
        //     System.out.println(arr[i] + " ");  // 40
        // }

        


        // ArrayList<Integer> list = new ArrayList<Integer>();  // Dynamic array
        // for(int i=0;i<5;i++){ 
        //     int val = sc.nextInt(); 
        //     list.add(val);
        // }
        
        // for(int i=0;i<5;i++){ 
        //     System.out.print(list.get(i) + " ");
        // }

        int[][] array_2d = new int[3][3]; 

        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                array_2d[row][col] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println();
        
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                System.out.print(array_2d[row][col] + " ");
            }
            System.out.println();
        }

    }
}
