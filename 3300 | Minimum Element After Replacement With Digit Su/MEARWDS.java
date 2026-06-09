class Solution {
    public int minElement(int[] nums) {
        int m=0;
        int n=100000;
        for(int i=0;i<nums.length;i++)  {
            while(nums[i]>0){
                m=m+nums[i]%10;
                nums[i]/=10;
            }
            n=Math.min(n,m);
            m=0;
        }
        return n;
    }
}
