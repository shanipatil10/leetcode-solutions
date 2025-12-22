Remove Element (LeetCode)
Problem Statement

Given an integer array nums and an integer val, remove all occurrences of val in-place.
Return the number of elements remaining after removal (k).
The first k elements of nums should contain the remaining elements.

Approach
Use a pointer k to track the position of valid elements.

Traverse the array:

If nums[i] is not equal to val, place it at index k.
Increment k.
Elements are overwritten in-place, no extra array is used.

Example

Input:
nums = [3,2,2,3], val = 3

Output:
k = 2
nums = [2,2,...]

Time & Space Complexity
Time Complexity: O(n)
Space Complexity: O(1) (in-place)

Key Points
No extra memory used

Order of remaining elements is preserved

Efficient and optimal solution
