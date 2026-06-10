class Solution {
    public int findMaxK(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int max=-1;
        Arrays.sort(nums);
        while(start<end){
            if(nums[start]*(-1)==nums[end]||nums[start]==nums[end]*(-1)){
                max=Math.max(max,Math.max(nums[start],nums[end]));
                start++;
                end--;
            }else if(nums[start]<nums[end]){
                if(nums[start]>nums[end]*(-1)){
                    end--;
                }else if(nums[start]<nums[end]*(-1)){
                    start++;
                }
            }else {
                start++;
                end--;
            }
        // if(nums[start]<nums[end]){
        //     if(nums[start]==nums[end]*(-1)||nums[start]*(-1)==nums[end]){
        //         max=Math.max(max,Math.max(nums[start],nums[end]));
        //         end--;
        //     }
        //     start++;
            
        // }
        // else if(nums[start]>nums[end]){
        //     if(nums[start]==nums[end]*(-1)||nums[start]*(-1)==nums[end]){
        //         max=Math.max(max,Math.max(nums[start],nums[end]));
        //         start++;
        //     }
        //     end--;
        // }
        // else{
        //     start++;
        //     end--;
        // }
        }
        return max;
    }
}
