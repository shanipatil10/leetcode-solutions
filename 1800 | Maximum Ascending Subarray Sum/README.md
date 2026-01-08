Maximum Ascending Subarray Sum

Problem Description
Given an integer array, find the maximum possible sum of a contiguous subarray
The subarray must be strictly increasing
Only continuous elements are allowed

Approach
A greedy single-pass approach is used
The array is traversed from left to right
A running sum is maintained for the current ascending subarray
When the ascending order breaks, the sum is reset from the current element

Logic Explanation
Initialize the sum with the first element
Compare each element with its previous one
If the current element is greater, extend the subarray and update the sum
If not, start a new subarray from the current element
Track the maximum sum during traversal

Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1)

Key Points
Works only for contiguous strictly increasing subarrays
No extra data structures are used

Efficient and optimal solution
Suitable for competitive programming and interviews

Output
Returns the maximum sum of any ascending subarray
