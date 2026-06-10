📍 Largest Positive Integer That Exists With Its Negative (LeetCode 2441)

🧠 Problem Statement

Given an integer array nums, find the largest positive integer k such that:

k exists in the array.
-k also exists in the array.

Return the largest such positive integer.

If no such integer exists, return -1.

⚙️ Approach Used: Sorting + Two Pointers

This solution first sorts the array and then uses the two-pointer technique to search for pairs of opposite values.

Two pointers are maintained:

start → points to the smallest element.
end → points to the largest element.

The goal is to find numbers where:

nums[start] = -nums[end]

Whenever such a pair is found, the answer is updated with the larger positive value.

🔄 Step-by-Step Logic

Sort the Array
Sort all elements in ascending order.
Negative values move to the left side.
Positive values move to the right side.
Initialize Two Pointers
start at the beginning.
end at the end.
Search for Opposite Pairs

For each iteration:

Check whether the current pair are opposites of each other.
If yes:
Update the maximum valid value.
Move both pointers inward.
Adjust Pointers

If the values are not opposites:

Compare their magnitudes.
Move the pointer that helps move closer to a potential match.

This efficiently narrows the search space without checking every possible pair.

Return Result
Return the largest valid positive integer found.
If no valid pair exists, return -1.

✅ Why This Works

After sorting:

Negative numbers appear on the left.
Positive numbers appear on the right.

The two-pointer strategy allows the algorithm to compare potential opposite pairs efficiently without using nested loops.

Whenever a pair (k, -k) is found, the positive value becomes a candidate answer.

By continuously updating the maximum valid value, the final answer is guaranteed to be the largest possible k.

🎯 Key Concepts Used

Arrays
Sorting
Two Pointers
Opposite Number Matching
Greedy Traversal

⏱️ Complexity Analysis

Time Complexity: O(n log n)

Sorting the array takes O(n log n).
Two-pointer traversal takes O(n).

Overall complexity remains:

O(n log n)

Space Complexity: O(1)

Only a few extra variables are used.
