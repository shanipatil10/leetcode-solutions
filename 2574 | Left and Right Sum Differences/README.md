📍 Left and Right Sum Differences (LeetCode 2574)

🧠 Problem Statement

Given an integer array nums, create an array answer such that:

leftSum[i] is the sum of all elements to the left of index i.
rightSum[i] is the sum of all elements to the right of index i.

For each index, compute:

|leftSum[i] - rightSum[i]|

Return the resulting array.

⚙️ Approach Used: Running Prefix Sum + Total Sum

This solution avoids creating separate prefix and suffix arrays.

Instead, it uses:

leftSum → tracks the sum of elements on the left side.
totalSum → stores the sum of the entire array.
rightSum → calculated dynamically during traversal.

This reduces the space complexity while maintaining a single-pass computation after preprocessing.

🔄 Step-by-Step Logic

Calculate Total Sum
Traverse the array once.
Store the sum of all elements in totalSum.
Initialize Left Sum
Start with leftSum = 0.
Initially, there are no elements to the left of index 0.
Compute Right Sum Dynamically

For every index:

Calculate the right-side sum using:

rightSum = totalSum - leftSum - nums[i]

This removes:
Current element
Already processed left-side elements
Find Absolute Difference

Compute:

|leftSum - rightSum|

Store the result in the answer array.
Update Left Sum
Add the current element to leftSum.
Move to the next index.

✅ Why This Works

At any index:

leftSum already contains the sum of all previous elements.
rightSum can be derived from the total array sum without traversing the array again.

This eliminates the need for separate prefix and suffix arrays while still producing the correct difference for every position.

🎯 Key Concepts Used

Prefix Sum
Running Sum
Array Traversal
Dynamic Computation
Space Optimization

⏱️ Complexity Analysis

Time Complexity: O(n)

One pass to calculate total sum.
One pass to build the answer array.

Space Complexity: O(1) (excluding the output array)

Only a few variables are used.
No extra prefix or suffix arrays are created.
