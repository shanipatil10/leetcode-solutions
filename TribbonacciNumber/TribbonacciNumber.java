class Solution {
    public int tribonacci(int n) {
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        int firstterm=0;
        int secondterm=1;
        int thirdterm=1;
        for(int i=2;i<=n;i++){
            int fourthterm=firstterm+secondterm+thirdterm;
            firstterm=secondterm;
            secondterm=thirdterm;
            thirdterm=fourthterm;

        }
        return firstterm; 
    }
}
