//TC O(NlogN)
//SC O(N)
class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        // int n=dist.length;
        // Arrays.sort(dist);
        // Arrays.sort(speed);
        // int count=0;
        // if(n==0){
        //     return 0;
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(dist[j]==-1){
        //             continue;
        //         }

        //         else if(dist[j]<=0){
        //             return count;
        //         }
        //         dist[j]=dist[j]-speed[j];
        //     }
        //     dist[i]=-1;
        //     count++;
        //     }
        // return n; Tried solution but O(n2)
        int n=dist.length;
        int count=0;
        float[] time=new float[n];
        for(int i=0;i<n;i++){
            time[i]=(float)dist[i]/speed[i];
        }
        Arrays.sort(time);
        for(int i=0;i<n;i++){
            if(time[i]<=i){
                return count;
            }else{
                count++;
            }
            // if(time[i]<=i){
            //     return i;
            // }
        }
        return n;

    }
}
