public class QuickSort {
    public static void main(String args[]){
        int[] arr = new int[]{55,-2,77,22,-1,88,66,-2,33,11,44};
        for(int n : arr){
            System.out.print(n+" ");
        }
        System.out.println();
        quickSort(arr,0,arr.length-1);
        for(int n : arr){
            System.out.print(n+" ");
        }
    }

    static void quickSort(int[] arr,int lower, int upper){
        if(lower < upper){
            int p = partition(arr,lower,upper);
            quickSort(arr, lower, p-1);
            quickSort(arr, p+1, upper);
        }
    }

    static int partition(int[] arr,int lower, int upper){
        int pivot = arr[lower];
            int i = lower+1;
            int j = upper;
            while(i<j){
                while(arr[i] < pivot){
                    i++;
                }
                while(arr[j] > pivot){
                    j--;
                }
                
                if(i < j){
                    arr[i] = arr[i]^arr[j];
                    arr[j] = arr[i]^arr[j];
                    arr[i] = arr[i]^arr[j];
                }
            }
            arr[lower] = arr[j]^arr[lower];
            arr[j] = arr[j]^arr[lower];
            arr[lower] = arr[j]^arr[lower];

            return j;
    }
}
