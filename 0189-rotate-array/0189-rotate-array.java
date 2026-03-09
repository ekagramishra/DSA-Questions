class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int start = n - k; // to know the starting index

        int first[] = new int[k];
        int j = 0;

        int last[] = new int[n - k];

        for(int i = start; i <= n - 1; i++){
            if(j == k){
                break;  
            }
            first[j] = nums[i];
            j++;
        }

        for(int i = 0; i < start; i++){
            last[i] = nums[i];
        }

        int xyz[] = new int[first.length + last.length];

        for(int i = 0; i < first.length; i++){
            xyz[i] = first[i];
        }

        for(int i = 0; i < last.length; i++){
            xyz[first.length + i] = last[i];
        }

        for(int i = 0; i < n; i++){
            nums[i] = xyz[i];
        }
    }
}
/*
Approach 1:

tried solving this from thr approach where i would keep last and first elements and merge them, but turns out the space complexity would increase to O(n) instead of O(1)

hence,
Approach 2:
shifting the elements to the right after taking one element and bringing them on th e first place
this did not work as well since the time complexity of this was O(n x k) for large output and while submitting it showed TIME LIMIT EXCEEDED.

Approach 3:

 */