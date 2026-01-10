📍 Find First and Last Position of Element in Sorted Array

📌 Problem Description
Given a sorted integer array and a target value, find the starting and ending position of the target value in the array.
If the target is not present, return [-1, -1].

💡 Approach Used
Perform a binary search to find the first occurrence of the target.
When the target is found, continue searching on the left side to ensure it is the earliest index.
Perform another binary search to find the last occurrence of the target.
When the target is found, continue searching on the right side to ensure it is the latest index.
Return both indices as the final result.

🔍 Key Insight
The array is sorted, which makes binary search the ideal approach.
A single binary search is not sufficient to find both boundaries.
Separating the search into first and last occurrence guarantees correctness.

⏱️ Time Complexity
O(log n)
First occurrence search: O(log n)
Last occurrence search: O(log n)

🧠 Space Complexity
O(1)
Uses constant extra space.

✅ Why This Solution Is Optimal
Meets the problem’s required logarithmic time complexity.
Efficient for large input sizes.
Clean and easy-to-understand logic.
Standard interview-accepted solution.
