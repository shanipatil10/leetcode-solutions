Search Insert Position (LeetCode 35)

Problem Statement
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not found, return the index where it would be inserted to maintain order.

Approach
Binary Search is used because the array is already sorted.

The idea is to:
Search for the target using binary search
If found, return its index
If not found, return the position where the search ends (low), which is the correct insert index

Algorithm
Initialize low = 0 and high = nums.length - 1
While low <= high
Find mid
If nums[mid] == target, return mid
If nums[mid] < target, move right (low = mid + 1)
Else move left (high = mid - 1)
Return low as the insert position

Time Complexity
O(log n) — Binary Search
Space Complexity
O(1) — No extra space used

Key Insight
When binary search ends without finding the target, the low pointer always represents the correct insertion index.

Example

Input:
nums = [1, 3, 5, 6], target = 2

Output:
1

Conclusion
This solution is optimal and efficient, using binary search to achieve the best possible time complexity for a sorted array.
