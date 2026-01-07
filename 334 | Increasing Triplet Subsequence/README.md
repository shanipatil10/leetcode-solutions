Increasing Triplet Subsequence
Problem Overview
Given an integer array, determine whether there exist three elements
Condition: i < j < k and nums[i] < nums[j] < nums[k]
The elements do not need to be consecutive

Approach Used
A greedy approach is applied
Two variables are maintained:
the smallest value found so far
a middle value that is greater than the smallest but as small as possible
If a third value greater than both is found, an increasing triplet exists

Working Logic
The array is traversed only once
For each element:
update the smallest value if possible
otherwise update the middle value
if the current value is greater than both, the result is confirmed

Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1)

Key Points
No extra arrays or sorting are used
Runtime exceptions are avoided
Works for non-adjacent elements
Suitable for interviews and competitive programming

Result
Returns true if an increasing triplet exists
Returns false otherwise.
