import java.util.*;
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        Arrays.sort(capacity);
        int add=0;
        int count=0;
        for(int i=capacity.length-1;i>=0;i--){
            if(add<sum){
               add+=capacity[i];
               count++;
            }
        }
        return count;
    }
}
