class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // HashSet<Integer> hs=new HashSet<>();
        // int n;
        // int m;
        // if(nums1.length>=nums2.length){
        //     n=nums1.length;
        //     m=nums2.length;
        // }else{
        //     n=nums2.length;
        //     m=nums1.length;
        // }
        // for(int i=0;i<n;i++){
        //     if(n==nums1.length){
        //     if(!hs.contains(nums1[i])){
        //         hs.add(nums1[i]);
        //     }}
        //     else{
        //         if(!hs.contains(nums2[i])){
        //         hs.add(nums2[i]);
        //     }
        //     }
        // } 
        // ArrayList<Integer> al=new ArrayList<>();
        
        // for(int i=0;i<m;i++){
        //     if(nums1.length<nums2.length){
        //     if(hs.contains(nums1[i])&&!al.contains(nums1[i])){
                
        //         al.add(nums1[i]);        
        //     }}else{
        //       if(hs.contains(nums2[i])&&!al.contains(nums2[i])){
        //         al.add(nums2[i]);        
        //     }   
        //     }
        // }
        // int arr[]=new int[al.size()];
        // for(int i=0;i<al.size();i++){
        //     arr[i]=al.get(i);
        // }
        // return arr;

        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(!hs.contains(nums1[i])){
                hs.add(nums1[i]);
            }
        } 
        HashSet<Integer> hs2=new HashSet<>();  
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i])){
                hs2.add(nums2[i]);
            }
        }
        int arr[]=new int[hs2.size()];
        int i=0;
        for(int num:hs2){
            arr[i++]=num;
        }
        return arr;


    }
}
