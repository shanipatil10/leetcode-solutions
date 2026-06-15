class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int diff=nums[k+i-1]-nums[i];
            min=Math.min(diff,min);
        }
        return min;
        // Arrays.sort(nums);
        // int finals=Integer.MAX_VALUE;
        // int start=0;
        // int end=k-1;

        // while(end<nums.length){
        // int diff=nums[end]-nums[start];
        // finals=Math.min(diff,finals);
        // start++;
        // end++;}
        // return finals;
    }
}
