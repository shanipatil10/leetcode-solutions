class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> pq=new PriorityQueue<>();
         for(int i=0;i<nums.length;i++){
           if(pq.size()<k){
            pq.add(nums[i]);
           }else if(pq.peek()<nums[i]){
            pq.remove();
            pq.add(nums[i]);
           }
           
         }
         return pq.peek();//o(n);
        // int expele=-1;
        //  PriorityQueue<Integer> pq=new PriorityQueue<>();
        //  for(int num:nums){
        //     pq.add(num);
        //  }
        //  for(int i=0;i<=nums.length-k;i++){
        //    expele=pq.remove();
        //  }
        //  return expele; //O(nlogn);
    }
}
