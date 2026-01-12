Find Peak Element (LeetCode 162)

This solution finds a peak element in an array using an optimized binary search approach.

A peak element is an element that is greater than its neighbors.
For boundary elements, the missing neighbor is treated as negative infinity.

Approach Used
The solution uses Binary Search to achieve O(log n) time complexity.
The key idea is:
If the array is rising at mid, then a peak exists on the right side
If the array is falling at mid, then a peak exists on the left side
Binary search narrows the range until a peak is found
Handling Edge Cases
If array size is 1, that element is the peak
If array size is 2, the larger element is the peak
For index 0 and n-1, missing neighbors are treated as -∞ using Integer.MIN_VALUE

Algorithm Flow
Handle small array sizes (n = 1 and n = 2)
Initialize low = 0 and high = n - 1
While low < high:
Compute mid
Compare nums[mid] with neighbors
Move search space based on slope direction
When loop ends, low points to a peak index
Why This Is Optimal

Time Complexity: O(log n)
Space Complexity: O(1)
Uses binary search instead of linear scan
Fully satisfies LeetCode constraints and guarantees

Key Insight
Binary search always moves toward a peak because:
An increasing slope guarantees a peak ahead
A decreasing slope guarantees a peak behind
When low == high, that index must be a peak

Final Notes
No extra array or recursion used
Safe handling of boundaries without modifying the array
Clean and interview-ready logic
