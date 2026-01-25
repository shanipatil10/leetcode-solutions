class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int csum=0;
        int maxsum=Integer.MIN_VALUE;
       while(start<end){
            csum=nums[start]+nums[end];
            maxsum=Math.max(csum,maxsum);
            start++;
            end--;
        }
        return maxsum;
    }
}
