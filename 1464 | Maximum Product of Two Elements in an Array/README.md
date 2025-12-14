Maximum Product of Two Elements in an Array

Problem Statement
Given an integer array nums, find the maximum value of (nums[i] - 1) * (nums[j] - 1) where i != j.

Approach
Traverse the array once to find the largest and second largest elements.

Use two variables:
large → largest element
slarge → second largest element

Finally, compute the result using the formula:
(largest - 1) * (secondLargest - 1)
This approach avoids sorting and works efficiently in a single pass.

Algorithm
Initialize large and slarge to 0.
Iterate through the array:
If current element is greater than large, update both large and slarge.
Else if it is greater than slarge, update slarge.
Return (slarge - 1) * (large - 1).

Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1)
