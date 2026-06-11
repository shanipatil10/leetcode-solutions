class Solution {
    public int[] leftRightDifference(int[] nums) {
        //TC and SC O(N)
        // int leftsum[]=new int[nums.length];
        // leftsum[0]=0;
        // for(int i=0;i<nums.length-1;i++){
        //     leftsum[i+1]=leftsum[i]+nums[i];
        // }
        // int rightsum[]=new int[nums.length];
        // rightsum[nums.length-1]=0;
        // for(int i=nums.length-1;i>0;i--){
        //     rightsum[i-1]=rightsum[i]+nums[i];
        // }
        // int ans[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     ans[i]=Math.abs(leftsum[i]-rightsum[i]);
        // }
        // return ans;


        //TC O(n) and SC O(1)
        int leftsum=0;
        int totalsum=0;
        int rightsum;
        for(int i=0;i<nums.length;i++){
            totalsum=totalsum+nums[i];
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            rightsum=totalsum-leftsum-nums[i];
            ans[i]=Math.abs(leftsum-rightsum);
            leftsum+=nums[i];
        }
        return ans;
    }
}
