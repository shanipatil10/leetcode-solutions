class Solution {
    public int compress(char[] chars) {
        int index = 0;     
        int i = 0;    
        while (i < chars.length) {
            char current = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }
            chars[index++] = current;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    

        // int count=1;
        // StringBuilder sb=new StringBuilder("");
        // for(int i=1;i<chars.length;i++){
        //     if(chars[i-1]!=chars[i]){
        //     sb.append(chars[i-1]);
        //     if(count>1)
        //     sb.append(count);
        //     count=1;
        //     }else{
        //         count++;
        //     }
        // }
                

        // sb.append(chars[chars.length-1]);
        // if(count>1)sb.append(count);
        // for(int i=0;i<sb.length();i++){
        //     chars[i]=sb.charAt(i);
        // }
        // return sb.length();//extra space le rah ahain...
    
}}
