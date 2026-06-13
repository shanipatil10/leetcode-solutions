class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           int j=Math.abs(nums[i])-1;
           if(nums[j]>0){
                nums[j]=-nums[j];
           }else{
            al.add(j+1);
           }
        }
        return al;
    }
}
