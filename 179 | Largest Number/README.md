🔢 Largest Number (LeetCode 179)
📌 Problem Description
Given a list of non-negative integers, arrange them such that they form the largest possible number when concatenated.
The result must be returned as a string because the number may be very large.

🧠 Approach Explanation
Each integer is first converted into a string.
The strings are then sorted using a custom comparison rule.
For any two numbers a and b, the order is decided by comparing:
b + a
a + b
The arrangement that produces the larger concatenated value is placed first.
After sorting, all strings are appended together to form the final answer.

⚠️ Edge Case Handling
If the largest value after sorting is "0", it means all numbers are zero.
In this case, the correct output is "0" and not something like "000".

⏱️ Complexity Analysis
Time complexity is O(n log n) due to sorting with a custom comparator.
Space complexity is O(n) for storing string representations and building the result.

✅ Why This Solution Is Optimal
Sorting is unavoidable for correct ordering
Custom comparator guarantees the largest concatenation
Handles edge cases cleanly
Widely accepted in interviews and competitive programming
