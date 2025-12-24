🍎 Minimum Number of Boxes to Store Apples
📌 Problem Statement

🍏 You are given two arrays:
🍎 apple[] → number of apples in different piles
📦 capacity[] → capacity of each box
📥 Each box can store apples up to its capacity
🎯 Find the minimum number of boxes required to store all apples

🧠 Approach
➕ Calculate the total number of apples
🔢 Sort the capacity array in ascending order
📦 Start choosing boxes from the largest capacity
➕ Keep adding capacities until total capacity ≥ total apples
🔢 Count how many boxes are used

🧪 Example
📥 Input:
🍎 apple = [1, 3, 2]
📦 capacity = [4, 3, 1, 5]
➕ Total apples: 6
📦 Boxes used: 5 + 4
📤 Output: 2

⏱️ Time & Space Complexity
⏰ Time Complexity: O(n log n) (sorting required)
💾 Space Complexity: O(1) (no extra space)

⭐ Key Points
🚀 Greedy strategy
📦 Largest capacity boxes chosen first
⚡ Efficient and optimized solution
✅ Suitable for LeetCode submissions
