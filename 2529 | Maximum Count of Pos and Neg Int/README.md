Approach
Optimal Solution (O(log n) Time Complexity)
Since the array is sorted, we can use binary search to efficiently count negative and positive numbers:
Negative Count (negcount)
Use binary search to find the last negative number.
The count of negatives is index + 1.
Positive Count (poscount)
Use binary search to find the first positive number.
The count of positives is nums.length - index.
Return Math.max(negCount, posCount).

Time Complexity
Binary search on a sorted array is O(log n).
Two binary searches are performed, so overall complexity is still O(log n).

Space Complexity
O(1) — only a few variables are used, no extra data structures.
