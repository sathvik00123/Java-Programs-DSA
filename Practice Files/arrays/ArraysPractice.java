public class ArraysPractice {
    
    public static void main(String[] args){

        // program for swapping two numbers, which also makes array reversed

        int[] arr = {1,2,3,4,5,6,7,8};

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // approach without using arithmetic operator

            arr[start] = arr[start] ^ arr[end]; 
            arr[end] = arr[start] ^ arr[end];
            arr[start] = arr[start] ^ arr[end];
            start++;
            end--;

            // approach using arithmetic operator

            // int temp = arr[start];
            // arr[start++] = arr[end];
            // arr[end--] = temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }




    


        // 2-d array's

        // int[][] arr1 = {{1,2,3},
        //                 {4,5,6},
        //                 {7,8,9}};

        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr1[0].length;j++){   // i =0 
        //         System.out.print(arr1[i][j]+" ");// i =0 
        //     }                                    // i = 0
        //     System.out.println();
        // }








        //Multi-D array

        // int[][][] arr3D = {
        //     {{1,2},{3,4}},
        //     {{5,6},{7,8}}
        // };

        // for(int i=0;i<arr3D.length;i++){
        //     for(int j=0;j<arr3D[0].length;j++){   
        //         for(int k=0;k<arr3D[0][0].length;k++){
        //             System.out.print(arr3D[i][j][k]+" ");
        //         }
        //         System.out.println();
        //     }                                    
        //     System.out.println();
        // }

    }    

}
