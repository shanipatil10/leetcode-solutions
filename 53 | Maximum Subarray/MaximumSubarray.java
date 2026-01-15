class Solution {
    public int maxSubArray(int[] nums) {
    int currsum=Integer.MIN_VALUE;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
      int newsum=currsum+nums[i];
      if(newsum>nums[i])
        currsum=newsum;
      else
        currsum=nums[i];
      maxsum=Math.max(currsum,maxsum);
    } 
    return maxsum;
    }
}
