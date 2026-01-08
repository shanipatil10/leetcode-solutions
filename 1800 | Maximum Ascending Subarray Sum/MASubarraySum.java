import java.util.*;
class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum=sum+nums[i];
                maxsum=Math.max(sum,maxsum);
            }
            else{
                sum=nums[i];
            }
        }
        return maxsum;
    }
}
