class Solution {
    public int[] sortedSquares(int[] nums) {
        int start=0;
        int[] ans=new int[nums.length];
        int end=nums.length-1;
        int ptr=ans.length-1;

        while(start<=end){
            int se=nums[start]*nums[start];
            int ee=nums[end]*nums[end];
            if(se>ee){
                ans[ptr]=se;
                start++;
            }
            else{
                ans[ptr]=ee;
                end--;
            }
            ptr--;
        }
       
        return ans;
    }
}
