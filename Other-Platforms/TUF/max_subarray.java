/* 

class max_subarray {
    public int maxSubArray(int[] nums) {
        // to find the sum of subarrays
        int sum=0;
        int max=nums[0];
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i;j<=nums.length-1;j++){
                int first= i;
                int last = j ;
                for(int k= first;k<=last;k++){
                    sum+= nums[k];
                }
                if(sum >= max){
                    max = sum;
                    sum =0;
                } else{
                    sum =0;
                }
            }
        }
        return max;
    }
} 
    
*/

//this is the solution that came to my mind as in a brute force approach, so i will try and optimize the code slowly with time :) 