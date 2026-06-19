class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if(count>1) return false;
            }
        }
        if (nums[nums.length - 1] > nums[0]) {
            count++;
        }
        return count <= 1;
        // int count = 0;
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] > nums[i - 1]) {
        //         count++;
        //     } else {
        //         break;
        //     }
        // }
        // if (count == nums.length - 1) {
        //     return true;
        // } else {
        //     count=0;
        //     for (int i = 0; i < nums.length; i++) {
        //         if (nums[i] > nums[(i + 1) % nums.length]) {
        //             count++;
        //         }
        //     }
        // }
        // return count <= 1;
    }
}
