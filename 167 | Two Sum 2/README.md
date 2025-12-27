🔢 Two Sum II – Input Array Is Sorted
📘 Problem Description

You are given a sorted array of integers numbers and an integer target.
Your goal is to find two numbers such that their sum equals the target. 🎯

👉 Return the 1-based indices of these two numbers.
✅ It is guaranteed that exactly one solution exists.

💡 Approach: Two Pointer Technique

Because the array is already sorted, we use the two-pointer approach 🚀
🔹 One pointer starts from the beginning of the array
🔹 Another pointer starts from the end of the array

➡️ Compare the sum of both pointers:
➕ If the sum is less than target, move the left pointer forward
➖ If the sum is greater than target, move the right pointer backward
🎉 If the sum equals the target, the answer is found

🧠 Algorithm Steps
📍 Initialize two pointers: start (beginning) and end (end of array)
🔁 Keep checking the sum of values at both pointers
👉 Adjust pointers based on comparison with target
🏁 Once the sum matches, return the 1-based indices

⏱️ Complexity Analysis
⏰ Time Complexity: O(n) — each element is checked once
💾 Space Complexity: O(1) — no extra space used

✅ Key Points
🔹 Works only because the array is sorted
🔹 Faster and more efficient than brute force
🔹 Guaranteed solution ensures safe execution
