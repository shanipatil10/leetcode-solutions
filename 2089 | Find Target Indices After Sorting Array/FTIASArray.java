class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> al=new ArrayList<>();
        int count=0;
        int tcount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                count++;
            }
            else if(nums[i]==target){
              tcount++;
            }
        }
        for(int i=0;i<tcount;i++){
            al.add(count);
            count++;
        }
        return al;

        
    //     ArrayList<Integer> al=new ArrayList<>();
    //     Arrays.sort(nums);
    //     for(int i=0;i<nums.length;i++){
    //     if(nums[i]==target){
    //         al.add(i);
    //     }
    //    }
    //    return al;
    }
}
