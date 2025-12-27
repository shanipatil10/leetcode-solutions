📦 Product of Array Except Self
📘 Problem Description
Given an integer array nums, return an array answer such that:
answer[i] is equal to the product of all elements of nums except nums[i].

🚫 Division is not allowed.
⏱️ The solution must run in O(n) time.
💡 Approach: Prefix & Suffix Product

To solve this efficiently, we use the idea of prefix and suffix products.
🔹 Prefix Product
For each index i, store the product of all elements to the left of i.
🔹 Suffix Product
Traverse the array from the right.
Multiply each index with the product of all elements to the right of i.

✅ This way, each index gets the product of all elements except itself, without using division.

🧠 How It Works
First pass builds left-side products.
Second pass multiplies right-side products.
The final result is stored directly in the output array.

🎯 Each element is visited only once from left and once from right.
🧪 Example
Input
nums = [1, 2, 3, 4]
Output
[24, 12, 8, 6]

⏱️ Complexity Analysis
⏰ Time Complexity: O(n)
💾 Space Complexity: O(1) (excluding output array)

✅ Key Highlights
🚀 Efficient and optimized
❌ No division used

🔁 Works correctly even with zeros
💼 Interview-ready approach

🏁 Conclusion
The Prefix + Suffix method is the best and standard solution for this problem.
It is clean, fast, and handles all edge cases effectively 💯🔥
