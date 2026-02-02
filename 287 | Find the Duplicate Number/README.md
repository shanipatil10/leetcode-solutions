🔍 Find the Duplicate Number (LeetCode 287)
🧠 Problem Overview
You are given an integer array nums containing n + 1 integers where each integer is in the range [1, n].
There is only one duplicated number, but it may appear more than once.
Your task is to find and return the duplicate number.

⚙️ Approach Used: Index Marking (Negative Marking)
📌 This solution uses the array itself to track visited numbers.
How it works:
Iterate through the array
For each element:
Use its absolute value as an index
Mark the value at that index as negative
If you encounter an index that is already negative → that index is the duplicate

🧠 Key idea:
If a number is seen twice, its index will be accessed twice.
✅ Why This Works
Numbers are guaranteed to be within index range
First visit → mark negative
Second visit → detect duplicate

🔄 Array Restoration
After detecting the duplicate, the array is restored back to its original form by converting all values to positive.
This is important if the array is reused later.

⏱️ Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1) (no extra data structures used)
