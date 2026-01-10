📌 Problem Description

Given a sorted integer array and a target value, determine whether the target exists in the array.
If it exists, return its index. Otherwise, return -1.

💡 Approach Used
Initialize two pointers representing the start and end of the array.
Calculate the middle index of the current search range.
Compare the middle element with the target.
If the target matches the middle element, return its index.
If the target is greater, move the search to the right half.
If the target is smaller, move the search to the left half.
Continue until the search range becomes invalid.

🔍 Key Insight
Binary Search works only on sorted arrays.
Each comparison eliminates half of the remaining elements.
This drastically improves performance compared to linear search.

⏱️ Time Complexity
O(log n)
The search space is reduced by half on each iteration.

🧠 Space Complexity
O(1)
Uses constant extra space.

✅ Why This Solution Is Optimal
Much faster than linear search for large arrays.
Simple and clean logic.
Standard and widely accepted interview approach.
Efficient and scalable.
