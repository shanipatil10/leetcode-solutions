class Solution {
    public boolean checkGoodInteger(int n) {
        int original=n;
        int digitsum=0;
        int squaresum=0;
        while(n>0){
            digitsum=digitsum+n%10;
            squaresum=squaresum + (int)Math.pow(n%10,2);
            n=n/10;
        }
        return squaresum-digitsum>=50;
        
    }
}
