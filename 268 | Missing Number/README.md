# Missing Number

## Problem Statement
Given an array `nums` containing `n` distinct numbers taken from the range `[0, n]`, return the only number in the range that is missing from the array.

## Approach
1. Sort the given array using `Arrays.sort()`.
2. Traverse the array and compare each index with its value.
3. If an index `i` does not match `nums[i]`, then `i` is the missing number.
4. If all indices match, then the missing number is `n` (length of the array).

## Algorithm
- Sort the array.
- Loop from `i = 0` to `n - 1`.
- If `i != nums[i]`, return `i`.
- Otherwise, return `n`.

## Time Complexity
- **O(n log n)** due to sorting.

## Space Complexity
- **O(1)** (excluding sorting overhead).

## Notes
- This solution is correct and accepted on LeetCode.
- An optimized solution with **O(n)** time and **O(1)** space exists and will be implemented later.

## Language Used
- Java
