class MergeSort{
    public static void main(String args[]){
        int[] arr = new int[]{55,-2,11,44,77,22,-1,88,66,-2,33,11,44};
        for(int n : arr){
            System.out.print(n+" ");
        }
        System.out.println();
        mergeSort(arr,0,arr.length-1);
        for(int n : arr){
            System.out.print(n+" ");
        }
        
    }

    static void mergeSort(int[] arr,int low,int high){
        if(low < high){
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            mergeArr(arr, low, mid, high);
        }
    }

    static void mergeArr(int[] arr, int low, int mid, int high){
        int i = low, j = mid+1, k = 0;
        int temp[] = new int[high+1];
        while(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                temp[k] = arr[i++];
            }else{
                temp[k] = arr[j++];
            }
            k++;
        }

        while(j <= high){
            temp[k++] = arr[j++];
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        for(int m = 0;m < k;m++){
            arr[low+m] = temp[m];
        }

    }
}