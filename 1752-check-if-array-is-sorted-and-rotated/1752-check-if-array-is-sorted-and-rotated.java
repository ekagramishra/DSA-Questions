class Solution{

    public boolean check(int nums[]){

        int n = nums.length;
        int rot[] = new int[n];

        for(int i= 0;i< n;i++){  
            int k= 0;
            for(int j = i;j< n;j++){
                rot[k++] = nums[j];
            }
            for(int j= 0;j< i;j++){
                rot[k++] = nums[j];
            }
            boolean isSorted = true;
            for(int j= 0; j< n - 1;j++){
                if (rot[j] > rot[j + 1]){
                    isSorted = false;
                    break;
                }
            }
            if (isSorted){
                return true;
            }
        }
        return false;
    }
}
