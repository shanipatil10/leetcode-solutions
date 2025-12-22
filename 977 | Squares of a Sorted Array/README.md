Squares of a Sorted Array
Problem Statement
Given an integer array nums sorted in non-decreasing order
Return an array containing the squares of each number
The resulting array must also be sorted in non-decreasing order

Optimal Approach (Two Pointer Technique)
The array may contain negative and positive numbers
Squaring negative numbers can give larger values

Use two pointers:
start → beginning of the array
end → end of the array

Compare:
Square of nums[start]
Square of nums[end]
Place the larger square at the end of the result array

Move pointers inward until all elements are processed

Example
Input: [-4, -1, 0, 3, 10]
Output: [0, 1, 9, 16, 100]

Time & Space Complexity
Time Complexity: O(n)
Space Complexity: O(n)

Key Points
Uses Two Pointer technique
Avoids Arrays.sort()
Processes array in single pass
Optimal solution for LeetCode
