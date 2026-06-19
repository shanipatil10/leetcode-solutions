📍 Maximum Average Subarray I (LeetCode 643)

🧠 Problem Statement

Given an integer array nums and an integer k, find the contiguous subarray of length k that has the maximum average value.

Return the maximum average among all possible subarrays of size k.

⚙️ Approach Used: Sliding Window

This solution uses the Sliding Window technique to efficiently calculate the sum of every subarray of size k.

Instead of recomputing the sum for every window from scratch:

The first window sum is calculated normally.
Each subsequent window reuses the previous sum.
The outgoing element is removed.
The incoming element is added.

This significantly reduces unnecessary calculations.

🔄 Step-by-Step Logic

Calculate First Window Sum
Start from index 0.
Compute the sum of the first k elements.
Compute First Average
Divide the window sum by k.
Store it as the current maximum average.
Slide the Window

For every next position:

Remove the element leaving the window.
Add the element entering the window.
Calculate the updated average.
Update Maximum Average
Compare the current average with the maximum average found so far.
Update whenever a larger average is discovered.
Return Result
After examining all windows, return the maximum average.

✅ Why This Works

Every valid subarray must contain exactly k elements.

Using a sliding window allows the algorithm to reuse previously computed information instead of recalculating each subarray sum independently.

The running sum always represents the current window, making average calculation efficient.

🎯 Key Concepts Used

Arrays
Sliding Window
Running Sum
Window Optimization
Maximum Tracking

⏱️ Complexity Analysis

Time Complexity: O(n)

First window computation takes O(k).
Remaining windows are processed in O(n).

Overall complexity:

O(n)

Space Complexity: O(1)

Only a few variables are used.
