class Solution {
    public int pivotIndex(int[] nums) {
        int rsum=0;
        int lsum=0;
        for(int i=nums.length-1;i>=0;i--){
            rsum=rsum+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rsum=rsum-nums[i];
            if(rsum==lsum){
                return i;
            }
            lsum=lsum+nums[i];
        }
        return -1;
    }
}
