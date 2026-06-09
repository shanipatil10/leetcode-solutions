📍 Check if Array is Good (LeetCode 2784)

🧠 Problem Statement

An array is considered good if it can be rearranged to form:

[1, 2, 3, ..., n - 1, n - 1]

where:

Every number from 1 to n - 2 appears exactly once.
The largest number (n - 1) appears exactly twice.

Given an integer array nums, return:

true if the array is good.
false otherwise.

⚙️ Approach Used: Sorting & Pattern Verification

This solution first sorts the array and then verifies whether it follows the required good-array pattern.

After sorting:

Elements from the beginning should appear in increasing order starting from 1.
The last two elements should both be equal to n - 1.

🔄 Step-by-Step Logic

Sort the Array
Arrange all elements in ascending order.
This makes pattern checking straightforward.
Verify Sequential Elements
Traverse from index 0 to n - 3.
Check whether:
First element is 1
Second element is 2
Third element is 3
and so on...
If any element breaks the sequence, return false.
Verify Last Two Elements
Check whether the last two elements are equal.
Ensure both are equal to n - 1.
Return Result
If all conditions are satisfied, return true.
Otherwise, return false.

✅ Why This Works

A good array has a very specific structure:

✔️ Numbers from 1 to n - 2 appear exactly once.

✔️ The maximum valid number n - 1 appears exactly twice.

Sorting places all values in order, making it easy to verify the expected pattern using a single traversal.

🎯 Key Concepts Used

Arrays
Sorting
Pattern Matching
Sequential Verification
Array Traversal

⏱️ Complexity Analysis

Time Complexity: O(n log n)

Sorting dominates the overall complexity.

Space Complexity: O(1)

No additional data structures are used (excluding sorting internals).
