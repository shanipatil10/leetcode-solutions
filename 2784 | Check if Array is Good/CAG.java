class Solution {
    public boolean isGood(int[] nums) {
        // int max=Integer.MAX_VALUE;
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     max=Math.max(max,nums[i]);
        // }
        // if(nums.length-1==max){
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==max){
        //         count++;
        //     }
        // }
        // if(count==2){
        //     return true;
        // }
        // }
       
        // return false;
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums.length-1==nums[i]){
        //         count++;
        //     }
        // }
        // if(count==2){
        //     return true;
        // }
        // return false;
    //    for(int i=0;i<nums.length;i++){
    //        if(nums.length-1==nums[i]){
    //             count++;
    //         } 
    //     }
     Arrays.sort(nums); 
        for(int i=0;i<nums.length-2;i++){
           if(nums[i]!=i+1){
            return false;
           }
        }
        if(nums.length-1==nums[nums.length-1]&&nums.length-1==nums[nums.length-2]){
            return true;
        }
        return false;
    }
}
