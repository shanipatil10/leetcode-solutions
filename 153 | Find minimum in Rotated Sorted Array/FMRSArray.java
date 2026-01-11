class Solution {
    public int findMin(int[] nums) {
     int low=0;
     int high=nums.length-1;
     int mid;
     int ans=-1;
     
    if(nums.length==1)
    return nums[0];
    else if(nums[low]<nums[high])
    return nums[0];

    while(low<=high){
        mid=(low+high)/2;
        if(nums[mid]<=nums[high]&&nums[mid]<=nums[low]){
            if(nums[mid-1]<nums[mid]){
             high=mid;
            }
            else{
            ans=nums[mid];
            return ans;}
        }
        else if(nums[low]<=nums[high]){
            ans=nums[low];
            return ans;
            
        }
        else if(nums[low]<=nums[mid]){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
     }
    return ans;
    }
}
