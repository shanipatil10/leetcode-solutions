class Solution {
    public int findPeakElement(int[] nums) {
       if(nums.length==1)
       return nums.length-1;
       else if(nums[0]<nums[1]&&nums.length==2)
            return 1;
       else if(nums[0]>nums[1]&&nums.length==2)
            return 0;

        int low=0;
        int high=nums.length-1;
        int mid=-1;
        // int nums[]=Integer.MIN_VALUE;
        // int nums[nums.length]=Integer.MIN_VALUE; //ye use nahi kar sakte java mein!!

        while(low<high){
            mid=(low+high)/2;
            int left=(mid==0)?Integer.MIN_VALUE:nums[mid-1];
            int right=(mid==nums.length-1)?Integer.MIN_VALUE:nums[mid+1];
            if(nums[mid]>left && nums[mid]>right)
                return mid;
            else if(nums[mid]<nums[mid+1])
                low=mid+1;
            else
                high=mid;
        }
        return low;
    }
}
