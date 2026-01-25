class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count=k;
        // int onecount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(count<k){
                    return false;
                }
                count=0;
                }
            else{
                count++;
                }
        //    if(i==0&&nums[i]==1){
        //     onecount++;
        //    }
        //    else if(nums[i]==0&&onecount==0){
        //     count=0;
        //    } 
        //    else if(nums[i]==1){
        //     if(count<k && onecount!=0){
        //         return false;
        //     }
        //     count=0;
        //     onecount++;
        //     }
        //    else{
        //         count++;
        //     }
        }
        return true;
    }
}
