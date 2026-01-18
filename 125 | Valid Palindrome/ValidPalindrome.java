class Solution {
    public boolean isPalindrome(String s) {
            int small=0;
            int large=s.length()-1;
            while(small<large){
                if(!Character.isLetterOrDigit(s.charAt(small)))
                    small++;
                else if(!Character.isLetterOrDigit(s.charAt(large)))
                    large--;
                else{
                    if(Character.toLowerCase(s.charAt(small))!=Character.toLowerCase(s.charAt(large))) 
                        return false;   
                    else{
                        small++;
                        large--;}
                    }
            }
     return true;
    //     String m=s.toLowerCase().replaceAll("[^a-z0-9]","");
    //     for(int i=0;i<m.length()/2;i++){
    //         char c=m.charAt(i);
    //         if(C!=m.charAt(m.length()-1-i)){
    //            return false;
    //         }
    //     }
    //    return true; space is O(n) ho raha tha ,toh ye optimal thodi hua...
    }
}
