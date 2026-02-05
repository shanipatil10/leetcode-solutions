📍 Find Pivot Index (LeetCode 724)
🧠 Problem Statement
Given an integer array nums, find the pivot index where the sum of all elements to the left of the index is equal to the sum of all elements to the right.
The pivot index itself is not included in either sum
If multiple pivot indexes exist, return the leftmost one
If no pivot index exists, return -1

⚙️ Approach Used: Prefix & Suffix Sum
This solution calculates:
rsum → total sum of all elements (right side sum initially)
lsum → sum of elements on the left side

🔄 Step-by-Step Logic
First, calculate the total sum of the array and store it in rsum
Traverse the array from left to right:
Remove current element from rsum
Compare lsum and rsum
If equal → current index is the pivot index
Add current element to lsum
If no index satisfies the condition, return -1

✅ Why This Works
At each index:
lsum = sum of elements before it
rsum = sum of elements after it
This avoids recalculating sums repeatedly

⏱️ Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1) (no extra array used)
