// package data structures.ProblemSolving;

public class RemoveDuplicates {
    public static void main(String args[]){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int l = 1,r = 1;
        for(int i = 0; i<nums.length-1;i++){
            if(nums[r-1] != nums[r]){
                nums[l] = nums[r];
                l++;
            }
            r++;
        }
        System.out.println("Number of unique elements : "+l);
        
        for(int i = 0; i<l;i++){
            System.out.print(nums[i]+ " ");
        }
    }
}
