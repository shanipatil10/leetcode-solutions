class Solution {
    public int maxProfit(int[] prices) {
        // int buy=prices[0];
        // int min=Integer.MAX_VALUE;
        // int max=Integer.MIN_VALUE;
        // int sell=0;
        // for(int i=0;i<prices.length;i++){
        //     if(prices[i]<buy){
        //         buy=prices[i];
        //         min=Math.min(buy,min);
        //     }
        // }
        // int j=0;
        // for(int i=0;i<prices.length;i++){
        //     if(prices[i]==buy){
        //          j=i;
        //         if(j==prices.length-1){
        //     return 0;
        // }
        //     }
        // }
        // for(int i=j+1;i<prices.length;i++){
        //     if(prices[i]>buy){
        //         sell=prices[i];
        //         max=Math.max(sell,max);
        //     }
        // }
        // return (max-min);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        if(prices.length<2){
            return 0;
        }
        for(int num:prices){
            min=Math.min(min,num);
            max=Math.max(max,num-min);
        }
        return max;
    }
}
