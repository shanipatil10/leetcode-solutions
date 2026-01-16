class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int result[]=new int[n+1];
        if(digits[n-1]!=9){
                digits[n-1]++;
                return digits;
            }
        for(int i=n-1;i>0;i--){   
            if(digits[i]==9&&digits[i-1]!=9){
                digits[i]=0;
                digits[i-1]++;
                return digits;
            }
            else{
                if(digits[i]==9&&digits[i-1]==9){
                    digits[i]=0;      
                }
            }
        }
        result[0]=1;
        return result;
    }
}
