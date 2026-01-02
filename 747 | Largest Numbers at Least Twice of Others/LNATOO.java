class Solution {
    public int dominantIndex(int[] nums) {
     int ans=0;
     int large=0;
     
     for(int i=0;i<nums.length;i++){
        if(large<nums[i]){
        ans=i;
        large=nums[i]; 
        }
     }

      for(int i=0;i<nums.length;i++){
        if(large<2*nums[i]){
            if(large==nums[i]){
            continue;}
            ans=-1;
            break;
        }   
      }
        return ans;
    }
}
