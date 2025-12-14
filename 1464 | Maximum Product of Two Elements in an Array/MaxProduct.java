class Solution {
    public int maxProduct(int[] nums) {
        int large=0;
        int slarge=0;
        for(int i=0;i<nums.length;i++){
            if(large<nums[i]){
            slarge=large;
            large=nums[i];
            }
            else if(slarge<nums[i])
              slarge=nums[i];
        }
        return (slarge-1)*(large-1);
    }
}
