Problem

Find the minimum element in a rotated sorted array of unique integers.

The array was originally sorted in ascending order and then rotated.
The task is to return the smallest element efficiently.

Approach Used
Binary Search is used to reduce the search space in each step.

Key ideas followed:
If the array is already sorted, the first element is the minimum.
In a rotated array, the minimum element lies at the point where order breaks.
Compare middle element with boundary elements to decide the search direction.
Narrow the search range until the minimum is found.
Early return conditions are used to handle edge cases and avoid unnecessary iterations.

Why Binary Search
The array has a sorted structure.
Each comparison helps discard half of the array.
This ensures fast performance even for large inputs.

Time Complexity
O(log n)
Binary search reduces the array size by half each iteration.

Space Complexity
O(1)
No extra space is used apart from variables.
