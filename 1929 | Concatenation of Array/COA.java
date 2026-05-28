class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        if(nums.length==0){
            return new int[0];
        }else if(nums.length==1){
            ans[0]=nums[0];
            ans[1]=nums[0];
            return ans;
        }
        for(int i=0;i<2*nums.length;i++){
            if(i<=nums.length-1){
                ans[i]=nums[i];
            }else{
                ans[i]=nums[i-(nums.length-1)-1];
            }
        }
        return ans;
    }
}
