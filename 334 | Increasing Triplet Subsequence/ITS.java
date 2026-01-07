class Solution {
    public boolean increasingTriplet(int[] nums) {

        if (nums.length < 3) return false;

        int i=Integer.MAX_VALUE;
        int j=Integer.MAX_VALUE;
        int k=Integer.MAX_VALUE;

       for(int y=0;y<nums.length;y++){
            int first=nums[y];
            if(i>=first){
                i=first;
            }
            else if(j>=first){
                j=first;
            }
            else{
                k=first;
                return true;
            }
       }
        return false;
    }
}
