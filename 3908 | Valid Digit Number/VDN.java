class Solution {
    public boolean validDigit(int n, int x) {
        int count=0;
        if(n==0&&x==0)
        return false;
        else{
        while(n>=10){
           int rem=n%10;
            if(rem==x){
                count++;
            }
            n=n/10;
        }
        while(n>0){
            if(n==x)
            return false;
            else
            n=n/10;
        }}
        return count>=1;
    }
}
