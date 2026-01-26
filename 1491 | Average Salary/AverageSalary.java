class Solution {
    public double average(int[] salary) {
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       double sum=0;

       for(int i=0;i<salary.length;i++){
        if(min>salary[i])
        min=Math.min(salary[i],min);
        if(max<salary[i])
        max=Math.max(max,salary[i]);
       }

       for(int i=0;i<salary.length;i++){
        if(max==salary[i]||min==salary[i])
        continue;
        else
            sum=sum+salary[i];
       }

       double avg=sum/(salary.length-2);
       return avg;
    }
}
