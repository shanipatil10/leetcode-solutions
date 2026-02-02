class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            int j=Math.abs(ele);
            if(nums[j]>0){
                nums[j]=-nums[j];
            }else{
                return j;
            }

        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        return -1;
        // int start=0;
        // int end=nums.length-1;
        // while(start<=end){
        //      if(start==end){
        //         start++;
        //         end=nums.length-1;
        //     }
        //     else if(nums[start]==nums[end]){
        //         return nums[start];
        //     }
        //     else{
        //         end--;
        //     }
        // }
        // return -1;

    }
}
