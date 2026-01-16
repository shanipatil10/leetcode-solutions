class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
        for(int n:nums){
            x=x^n;}
            return x;
        // HashMap<Integer,Integer> hm=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(hm.containsKey(nums[i])==true){
        //         hm.put(nums[i],hm.get(nums[i])+1);
        //     }
        //     else{
        //         hm.put(nums[i],1);
        //     }
        // }
        // for(int keys:hm.keySet()){
        //     if(hm.get(keys)==1){
        //         return keys;
        //     }
        //     }
        //     return -1; time comp:O(n) space comp:O(n)
    }
}
