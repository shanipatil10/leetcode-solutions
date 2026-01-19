🧮 Square Root of a Number (LeetCode 69)
📌 Problem Statement
Given a non-negative integer x, compute and return the square root of x.
Since the return type is an integer, only the integer part of the square root is returned, and any decimal part is discarded.

🧠 Approach Used
This solution uses Binary Search to efficiently find the square root.
The search space ranges from 0 to x. At each step, a middle value is calculated and its square is compared with x. Based on this comparison, the search space is reduced to the left or right half.
This continues until the correct integer square root is found.

⚠️ Important Consideration
Directly multiplying two integers (mid * mid) can cause integer overflow for large values of x.
To avoid this, the multiplication is performed using a larger numeric type, ensuring safe comparisons.

⏱️ Complexity Analysis
Time complexity is O(log x) because the search space is halved on each iteration.
Space complexity is O(1) since no additional data structures are used.
