class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> fin = new ArrayList<>();
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i] < 0){
                neg.add(nums[i]);
            } else{
                pos.add(nums[i]);
            }
        }
        for(int i=0;i<=pos.size()-1;i++){
            fin.add(pos.get(i));
            fin.add(neg.get(i));
        }
        return fin.stream().mapToInt(Integer::intValue).toArray();
    }
}