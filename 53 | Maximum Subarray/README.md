🚀 Maximum Subarray Problem

📌 Problem Description
The Maximum Subarray problem involves finding a contiguous subarray within a one-dimensional integer array that has the largest possible sum. The task is to compute and return this maximum sum.
This is a classic problem commonly asked in coding interviews and competitive programming platforms like LeetCode.

🧠 Solution Strategy
The solution uses a dynamic programming approach popularly known as Kadane’s Algorithm. The idea is to iterate through the array while maintaining a running sum that represents the maximum subarray ending at the current position.
At each step, a decision is made whether to extend the existing subarray or start a new subarray from the current element. The global maximum sum is updated accordingly.
This approach ensures that all negative and positive edge cases are handled correctly, including arrays with all negative values.

✨ Key Observations
A running sum is maintained to track the best subarray ending at each index.
If adding the current element decreases the sum, a new subarray is started.
The maximum sum encountered during traversal is stored as the final answer.
The solution works efficiently even when all elements are negative.

🧪 Example
For an input array like [-2,1,-3,4,-1,2,1,-5,4], the maximum subarray sum is 6, obtained from the subarray [4,-1,2,1].

⚙️ Complexity Analysis
Time Complexity: O(n) ⏱️
The array is traversed only once.

Space Complexity: O(1) 💾
No additional data structures are used.

🎯 Why This Solution?
Optimal and efficient
Clean logic with minimal variables
Handles all edge cases
Widely accepted and interview-friendly

🏁 Conclusion
This implementation provides a simple yet powerful way to solve the Maximum Subarray problem using an optimal approach. It is well suited for real-world coding interviews and competitive programming scenarios.
