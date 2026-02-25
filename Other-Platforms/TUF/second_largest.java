class second_largest {
    public int secondLargestElement(int[] nums) {
        
        int largest = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++){ 
            if(nums[i] > largest){
                largest2 = largest;
                largest = nums[i];
            } 
            else if(nums[i] < largest && nums[i] > largest2){
                largest2 = nums[i];
            }
        }
        if(largest2 == Integer.MIN_VALUE){
            return -1;
        } 
        return largest2;
    }
}


/*
-----------------
    QUESTION
-----------------

Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.

Example 1

Input: nums = [8, 8, 7, 6, 5]
Output: 7

Explanation:
The largest value in nums is 8, the second largest is 7

Example 2

Input: nums = [10, 10, 10, 10, 10]
Output: -1

Explanation:
The only value in nums is 10, so there is no second largest value, thus -1 is returned

*/