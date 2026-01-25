📘 README.md – K-Length Apart Check
🔹 Problem Statement
You are given a binary array nums (only 0s and 1s) and an integer k.
✅ Task: Check if all 1s are at least k distance apart.
Output: true if condition is satisfied, otherwise false.

🔹 Approach (Your Current Clean Code)
Initialize a counter count = k ✅
Loop through the array:
If element = 1:
Check if count < k → return false ❌
Reset count = 0 🔄
If element = 0:
Increment count++ ➕
Return true at the end ✔️

Why this works:
The count = k initialization automatically handles the first 1
Only one variable needed → minimal and clean

🔹 Complexity Analysis
⏱ Time Complexity: O(n) (single loop)
📦 Space Complexity: O(1) (only one counter variable)

🔹 Key Takeaways 🔑
Simple linear scan + counter variable is enough
Avoid over-complicating with extra variables or special cases
Works efficiently for any array size

✅ Minimal code, maximal readability
