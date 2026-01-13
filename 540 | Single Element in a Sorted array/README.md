Single Element in a Sorted Array (LeetCode 540)

Problem Statement
You are given a sorted array where every element appears exactly twice, except for one element that appears only once.
Find that single element.

Approach
The array is sorted, which allows the use of binary search.

The idea is:
The single element breaks the pairing pattern
On one side of the single element, pairs start at even indices
On the other side, pairs start at odd indices
Binary search is used to decide which half still contains the single element
Edge cases like the first and last element are handled separately.

Algorithm
Handle special cases:
If the array has only one element
If the first or last element is unique
Apply binary search:
Check if the middle element is different from both neighbors
If it forms a pair with the left or right element, decide the search direction using index parity
Continue until the single element is found

Time Complexity
O(log n) — Binary search

Space Complexity
O(1) — No extra space used
