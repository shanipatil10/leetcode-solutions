class Solution {
    public int missingNumber(int[] nums) {
        int ans;
        boolean flag=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                ans=i;
                flag=true;
                return ans;
                
            }
        }
        if(flag==false){
            ans=nums.length;
            return ans;
        }
        
        return 0;

    }
}
