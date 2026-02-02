class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        
         HashMap<Integer,Boolean> hm=new HashMap<>();
         for(int i=0;i<nums.length;i++){
               hm.put(nums[i],false); 
         }
         for(int key:hm.keySet()){
            if(hm.containsKey(key-1)==false){
                hm.put(key,true);
            }
         }
         int max=0;
         int count=1;
         for(int key:hm.keySet()){
            count=1;
            if(hm.get(key)==true){
               while(hm.containsKey(key+count)){
               count++;
               }
            }
            max=Math.max(count,max);
         }
         return max;
    }
}
