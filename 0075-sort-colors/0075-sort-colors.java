//this is a code of selection sort for now

class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]>nums[j]){
                    int temp= nums[i];
                    nums[i]= nums[j];
                    nums[j]= temp;
                }
            }
        }
    }
}


// the most optimized approach would be insertion sort