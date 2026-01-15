import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
      int start=1;
      int end=nums.length-1;
      int k=1;
      while(start<=end){
        if(nums[start]!=nums[start-1]){
            nums[k]=nums[start];
            k++;
            start++;
        }
        else
        start++;
      } 
      return k; 
    }
}
