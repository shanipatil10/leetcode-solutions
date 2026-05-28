LeetCode 1929: Concatenation of Array

🧠 Problem Statement
Given an integer array nums of length n, return an array ans of length 2n where:

ans[i] == nums[i]
ans[i + n] == nums[i]

In simple words, create a new array by repeating the original array twice.

⚙️ Approach Used: Array Simulation

This solution creates a new array of size 2 * nums.length and fills it using index mapping.

Two sections are handled:

First half → directly copy original elements
Second half → repeat the same elements again

🔄 Step-by-Step Logic

1️⃣ Create a new array ans of size 2n

2️⃣ Traverse from 0 to 2 * nums.length - 1

3️⃣ If index is within original array range:

Copy directly from nums[i]

4️⃣ Otherwise:

Map the index back to original array using:
i - nums.length

5️⃣ Store repeated values in the second half

6️⃣ Return the final concatenated array

✅ Why This Works

The second half of the array is simply a repetition of the first half.

Index mapping helps us reuse original elements without needing another loop or extra data structure.

⏱️ Complexity Analysis

Time Complexity: O(n)

Array is traversed once

Space Complexity: O(n)

Extra array of size 2n is used
