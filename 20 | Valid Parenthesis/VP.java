class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            } 
            else{
                if(stack.isEmpty())
                return false;
                char top=stack.pop();
                if((c==')'&&top!='(')||(c=='}'&&top!='{')||(c==']'&&top!='[')){
                    return false;
                }
            }
            }
            return stack.isEmpty();

        // HashMap<Character,Integer> hm=new HashMap<>();
        // // 
        // // hm.put('(',2);
        // // hm.put(')',1);
        // // hm.put('{',4);
        // // hm.put('}',3);
        // // hm.put('[',6);
        // // hm.put(']',5);
        // // int ans=0;
        // // for(int i=0;i<s.length();i++){
        // //     char c=s.charAt(i);
        // //     if(hm.containsKey(c)==true){
        // //         if(hm.get(c)==2||hm.get(c)==4||hm.get(c)==6)
        // //          ans=ans+hm.get(c);
        // //         else{
        // //             ans=ans-hm.get(c);
        // //          }
        // //     }
        // // }
        // // if(ans==s.length()/2){
        // //     return true;
        // // }
        // // else
        // // return false; // 1st approach nahi suit ho paya order mein...
    }
}
