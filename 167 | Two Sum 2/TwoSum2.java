class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        int start=0;
        int end=numbers.length-1;
        int sum;
        while(numbers[start]+numbers[end]!=target){
            if(numbers[start]+numbers[end]<target){
                start++;
            }
            else
            end--;
            
          
        }  ans[0]=start+1;
            ans[1]=end+1;
        
        return ans;
    }
}
