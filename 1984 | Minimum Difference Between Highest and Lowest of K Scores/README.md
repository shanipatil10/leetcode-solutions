📍 Minimum Difference Between Highest and Lowest of K Scores (LeetCode 1984)

🧠 Problem Statement

You are given an integer array nums representing student scores and an integer k.

Choose any k students such that the difference between the highest and lowest score among them is minimized.

Return the minimum possible difference.

⚙️ Approach Used: Sorting + Sliding Window

This solution first sorts the array so that scores are arranged in ascending order.

After sorting:

Any group of k consecutive elements represents a valid selection of k students.
The difference between the highest and lowest score in that group can be calculated directly.

The algorithm checks every possible window of size k and keeps track of the minimum difference found.

🔄 Step-by-Step Logic

Sort the Scores
Arrange all scores in ascending order.
This ensures that the minimum and maximum score of any selected group can be found at the window boundaries.
Create Windows of Size K
Traverse the sorted array.
Consider every consecutive group containing exactly k elements.
Calculate Difference

For each window:

Lowest score = first element of the window.
Highest score = last element of the window.

Compute:

difference = highest score - lowest score

Update Minimum Difference
Compare the current difference with the smallest difference found so far.
Update the answer whenever a smaller value is discovered.
Return Result
After checking all possible windows, return the minimum difference.

✅ Why This Works

After sorting, the closest scores naturally become adjacent.

If we want the minimum difference between the highest and lowest score among k students, it is sufficient to examine only consecutive groups of size k.

This avoids checking every possible combination and dramatically improves efficiency.

🎯 Key Concepts Used

Arrays
Sorting
Sliding Window
Greedy Observation
Range Calculation

⏱️ Complexity Analysis

Time Complexity: O(n log n)

Sorting takes O(n log n).
Window traversal takes O(n).

Overall complexity remains:

O(n log n)

Space Complexity: O(1)

No extra data structures are used (excluding sorting internals).
