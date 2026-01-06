class Solution {
    public int maxArea(int[] height) {
      int start=0;
      int end=height.length-1;
      int max=0;
      while(start<end){
            int hts=Math.min(height[start],height[end]);
            int wdth=end-start;

            if(hts*wdth>max){
                max=hts*wdth;
            }
            if(height[start]<height[end])
            start++;
            else
            end--;
            
      }  
      return max;
    }
}
