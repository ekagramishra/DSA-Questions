class Solution {
    public int missingNumber(int[] nums) {
        //in the question we first take out the range of the given array
        int range= nums.length;
        int c=0;
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<=range;i++){
            arr.add(i);
        }

        ArrayList<Integer> arr2= new ArrayList<>();
        for(int i=0;i<=range-1;i++){
            arr2.add(nums[i]);
        }
        Collections.sort(arr2);

        for(int i= 0; i< range;i++){
            if(!arr.get(i).equals(arr2.get(i))){
                c = arr.get(i);
                break;
            }
        }

        if(c == 0 && arr2.get(range - 1) == range - 1){
            c = range;
        }
        
        return c ;
    }
}