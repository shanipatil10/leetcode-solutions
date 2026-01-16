🔢 Single Number (LeetCode 136)
📌 Problem Overview
Given a non-empty integer array, every element appears exactly twice except for one element. The task is to find that single element efficiently.

🧠 Approach Used
This solution uses Bit Manipulation, specifically the XOR technique.
XOR has special properties that make it ideal for this problem:
A number XORed with itself becomes zero
A number XORed with zero remains unchange.
XOR operations can be applied in any order
By applying XOR across all elements, duplicate numbers cancel each other out, leaving only the unique element.

⚙️ Algorithm Explanation
The algorithm starts with an initial value of zero.
Each number in the array is XORed with this value.
Since duplicates appear twice, they eliminate each other.
The remaining value is the number that appears only once.

⏱️ Complexity Analysis
Time complexity is linear because the array is traversed once.
Space complexity is constant because no extra data structures are used.

This meets the optimal constraints expected by the problem.
🚀 Why This Approach Is Optimal
This method avoids additional memory usage like HashMap or HashSet.
It is faster in practice and preferred in interviews and competitive programming.

🏁 Conclusion
Using XOR provides a clean, efficient, and elegant solution to the Single Number problem.
It demonstrates strong understanding of bit manipulation and optimal problem-solving.
