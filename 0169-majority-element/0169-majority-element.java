class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        int mustHave= n/2;
        int count= 0;
        int hehe=0;
        for(int i=0;i<=n-1;i++){
            hehe=nums[i];
            count=0;
            for(int j=0;j<=n-1;j++){
                if(nums[i]==nums[j]){
                    ++count;
                }
            }
            if(count> mustHave){
                break;
            }
        }
        return hehe;
    }
}