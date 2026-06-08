class Solution {
    public int maxProductDifference(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int mul;
        while(start<end){
            mul=nums[start]*nums[end];
            max=Math.max(mul,max);
            if(nums[start]<=nums[end]){
                start++;
            }else{
                end--;
            }
        }
        start=0;
        end=nums.length-1;
         while(start<end){
            mul=nums[start]*nums[end];
            min=Math.min(mul,min);
            if(nums[start]>=nums[end]){
                start++;
            }else{
                end--;
            }
        }
        return max-min;

    }
}
