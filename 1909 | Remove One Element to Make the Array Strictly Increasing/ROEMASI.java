//TC=O(n)
//SC=O(1)

class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int ncount = 0;
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] < nums[start + 1]) {
                start++;

            } else {
                ncount++;
                if (ncount >= 2) {
                    return false;
                }
                if (start == 0) {
                    start++;
                    continue;
                } else {
                    if (nums[start - 1] >= nums[start + 1]) {
                        nums[start + 1] = nums[start];
                        start++;
                    } else {
                        start++;
                    }
                }
            }
        }

        return true;

    }
}
