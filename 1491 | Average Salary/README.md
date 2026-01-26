💰 Average Salary Excluding the Minimum and Maximum Salary
📘 Problem Description
You are given an integer array salary where each element represents the salary of an employee.
Return the average salary, excluding:
❌ the minimum salary
❌ the maximum salary
It is guaranteed that there are at least three employees.

💡 Approach
To solve this problem efficiently:
First, identify the minimum and maximum salary in the array.
Then, calculate the sum of all salaries except the minimum and maximum.
Divide this sum by (total employees − 2) to get the average.
This ensures only valid salaries are included in the calculation.

🧠 Algorithm Overview
Traverse the array to find the smallest and largest salary.
Traverse again to compute the sum of remaining salaries.
Compute the average using the adjusted count.

⏱️ Complexity Analysis
Time Complexity: O(n) ⏰
Space Complexity: O(1) 💾

✅ Why This Solution Is Optimal
🚀 Linear time — no sorting required
💾 Constant extra space
🎯 Simple and accurate
💼 Interview-friendly approach
