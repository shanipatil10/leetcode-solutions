class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(hm.containsKey(num)==true){
                hm.put(num,hm.get(num)+1);

            }
            else{
                hm.put(num,1);
            }
        }
        int ans=-1;
        for(int keys:hm.keySet()){
            if(keys==hm.get(keys))
            ans=Math.max(keys,ans);
        }
        return ans;
    }
}
