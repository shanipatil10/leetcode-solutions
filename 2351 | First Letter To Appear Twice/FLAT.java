class Solution {
    public char repeatedCharacter(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c-97]++;
            if(arr[c-97]==2){
                return c;
            }
        }
        return ' ';
    }
}
