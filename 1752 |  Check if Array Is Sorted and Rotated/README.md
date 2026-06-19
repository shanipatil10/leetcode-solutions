📍 Check if Array Is Sorted and Rotated (LeetCode 1752)

🧠 Problem Statement

Given an array nums, determine whether it was originally sorted in non-decreasing order and then possibly rotated some number of positions.

Return:

true if the array can be obtained from a sorted array after rotation.
false otherwise.

A rotation shifts elements from one end of the array to the other while preserving their relative order.

⚙️ Approach Used: Rotation Break Counting

This solution is based on a simple observation:

In a sorted array, elements should always be less than or equal to the next element.

A rotated sorted array can have at most one position where this order is broken.

The algorithm counts such violations and verifies whether the array satisfies the rotation property.

🔄 Step-by-Step Logic

Check Adjacent Elements
Traverse the array from left to right.
Compare every element with its next element.
Count Order Violations

Whenever:

nums[i] > nums[i + 1]

The sorted order is broken.
Increase the violation counter.
Early Termination
If more than one violation is found, return false immediately.
Check Circular Connection

A rotated array must also satisfy the relationship between:

Last element
First element

If:

nums[last] > nums[0]

Count it as another break in sorted order.
Return Result
If the total number of breaks is at most one, return true.
Otherwise, return false.

✅ Why This Works

A sorted array has zero breaks.

A sorted and rotated array has exactly one break where the rotation occurs.

If more than one break exists, the array cannot be produced by rotating a sorted sequence.

The final comparison between the last and first elements ensures the circular nature of rotation is correctly validated.

🎯 Key Concepts Used

Arrays
Circular Traversal
Rotation Logic
Greedy Observation
Order Verification

⏱️ Complexity Analysis

Time Complexity: O(n)

The array is traversed once.

Space Complexity: O(1)

Only a counter variable is used.
