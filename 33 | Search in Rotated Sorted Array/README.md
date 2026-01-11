🔄 Search in Rotated Sorted Array

📌 Problem Description
Given a rotated sorted integer array and a target value, find the index of the target.
If the target is not present, return -1.
The array was originally sorted in ascending order but then rotated at an unknown pivot.

💡 Approach Used
This solution uses a modified binary search technique.
Start with two pointers representing the beginning and end of the array.
Find the middle element.
If the middle element matches the target, return its index.
Determine which half of the array is sorted.
Check whether the target lies within the sorted half.
Narrow the search range accordingly.
Repeat until the target is found or the search space becomes empty.

🔍 Key Insight
In a rotated sorted array, at least one half is always sorted.
Identifying the sorted half allows us to apply binary search logic.
This approach avoids scanning the entire array.

⏱️ Time Complexity
O(log n)
The search space is reduced by half in each iteration.

🧠 Space Complexity
O(1)
Uses constant extra space.

✅ Why This Solution Is Optimal
Efficient for large arrays.
Correctly handles rotation.
Follows standard interview-accepted logic.
Much faster than linear search.
