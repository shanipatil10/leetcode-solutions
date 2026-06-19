class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxavg = Integer.MIN_VALUE;
        int start = 0;
        int end = nums.length - 1;
        double avg = 0;
        while (start <= end + 1 - k) {
            if (start == 0) {
                for (int i = start; i <= k + start - 1; i++) {
                    avg = avg + nums[i];
                }
            } else {
                avg = avg - nums[start - 1] + nums[k + start - 1];
            }
            double overavg = avg / k;
            maxavg = Math.max(overavg, maxavg);
            start++;
        }
        return maxavg;
    }
}
