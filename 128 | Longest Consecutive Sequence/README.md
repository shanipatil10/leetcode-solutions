🧠 Longest Consecutive Sequence – LeetCode 128
This project implements a solution to find the length of the longest consecutive sequence in an unsorted array of integers.
The solution is designed to work efficiently in linear time.

📌 Problem Description
You are given an unsorted array of integers.
Your task is to find the length of the longest sequence of consecutive numbers.
✔ The sequence elements must be consecutive
✔ Order in the original array does not matter
✔ The solution should run in O(n) time complexity

Explanation:
The longest consecutive sequence is 1, 2, 3, 4

🧠 Solution Explanation
🔹 All elements are stored for quick lookup
🔹 Numbers that do not have a predecessor are treated as starting points
🔹 From each starting point, the sequence is extended forward
🔹 The length of each sequence is calculated
🔹 The maximum length found is returned as the answer
This avoids sorting and ensures optimal performance.

⚙️ Algorithm Steps
📦 Store all elements for constant-time access
🏁 Identify sequence starting points
🔁 Traverse forward to count consecutive elements
📊 Track and update the maximum sequence length

⏱ Time Complexity
⏳ O(n) — each element is processed at most once
💾 Space Complexity
💽 O(n) — extra space used for storing elements
