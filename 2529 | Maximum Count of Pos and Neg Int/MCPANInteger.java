class Solution {
    public int maximumCount(int[] nums) {
       return Math.max(negcount(nums),poscount(nums));
    }
    public int negcount(int []nums){
        int ans=0;
        int left=0;
        int right=nums.length-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]<0){
                ans=mid+1;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
    public int poscount(int []nums){
        int ans=0;
        int left=0;
        int right=nums.length-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]>0){
                ans=nums.length-mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    // int pos=0;
    // int neg=0;
    // for(int i:nums){
    //     if(i>0){
    //         pos++;
    //     }
    //     else if(i<0){
    //         neg++;
    //     }
    // }
    // return Math.max(pos,neg); //hain but o(n)...optimal nahi hain
}
