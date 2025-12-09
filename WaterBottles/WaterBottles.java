class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
    while(numBottles>=numExchange){
        int quotient=numBottles/numExchange;
        int reminder=numBottles%numExchange;
        ans=quotient+ans;
        numBottles=quotient+reminder;

    }   
    return ans; 
    }
}
