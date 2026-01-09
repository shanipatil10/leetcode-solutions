import java.util.*;

class Solution {
    public int romanToInt(String s) {
       Map<Character,Integer> a=new TreeMap<>();
       a.put('I',1);
       a.put('V',5);
       a.put('X',10);
       a.put('L',50);
       a.put('C',100);
       a.put('D',500);
       a.put('M',1000);
       
       int ans=0;
    //    for(int i=0;i<s.length();i++){
    //    if(s.equalsTo(a.get(charAt(i)))){
    //      ans=ans+a.get(charAt(i));
    //    }
    //    }
       for(int i=1;i<s.length();i++){
        char key=s.charAt(i-1);
        if(a.get(s.charAt(i-1))<a.get(s.charAt(i))){
            ans=ans-a.get(key);
        }
        else{
            ans=ans+a.get(key);
        }
       }
       ans=ans+a.get(s.charAt(s.length()-1));//last character additon
       return ans;
       }
    }
