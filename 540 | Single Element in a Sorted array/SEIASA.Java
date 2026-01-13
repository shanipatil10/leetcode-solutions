class Solution {
    public int singleNonDuplicate(int[] nums) {
       int low=0;
       int high=nums.length-1;
       int mid;
       int size=nums.length;
        if(nums.length==1){
            return nums[0];
        }
        else if(nums[0]!=nums[1]){
            return nums[0];
        }
        else if(nums[size-1]!=nums[size-2]){
            return nums[size-1];
        }
   

        while(low<=high){
        mid=(low+high)/2;
        if((mid==0||nums[mid]!=nums[mid-1])&&(mid==nums.length-1||nums[mid]!=nums[mid+1])){
            return nums[mid];
        }
        else if(nums[mid]==nums[mid-1]){
            if((low+mid-1)%2!=0){
                high=mid-2;
            }
            else{
                low=mid+1;
            }
        }
        else if(nums[mid]==nums[mid+1]){
            if((low+mid)%2!=0){
                high=mid-1;
            }
            else{
                low=mid+2;
            }
        }
       }
       return nums[low]; //O(logn) hain 

        // TreeMap<Integer,Integer> tm=new TreeMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(tm.containsKey(nums[i])==true){
        //         tm.put(nums[i],tm.get(nums[i])+1);
        //     }
        //     else {
        //         tm.put(nums[i],1);
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(tm.get(nums[i])==1){
        //         return nums[i];
        //     }
        // }
        // return -1; (O(nlogn)) hain but O(logn) nahi hain
    }
}
