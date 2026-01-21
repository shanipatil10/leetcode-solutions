🎯 Target Indices After Sorting Array
📌 Problem Overview

Given an integer array and a target value, the task is to find all indices where the target would appear after sorting the array in non-decreasing order.
The result must be returned as a list of indices.

🧠 Approach Used
Instead of sorting the array, this solution uses a counting-based logic.
First, it counts how many numbers in the array are strictly smaller than the target. This count directly tells us the first index where the target would appear after sorting.
Then, it counts how many times the target occurs in the array. Using this information, the target indices are generated sequentially starting from the calculated position.
This avoids sorting entirely.

⚙️ Why This Works
In a sorted array:
All values smaller than the target come first
All target values appear consecutively
Their indices can be computed mathematically
By leveraging this property, the solution produces the correct indices efficiently.

⏱️ Complexity Analysis
Time complexity is O(n) because the array is traversed once.
Space complexity is O(1) excluding the output list.
This is more efficient than sorting-based approaches, which require O(n log n) time.

🔍 Comparison with Sorting Approach
A sorting-based solution is simpler to think about but less optimal.
This counting-based method is faster and more suitable for interviews when optimization matters.

🏁 Conclusion
This solution demonstrates how understanding problem constraints can eliminate unnecessary operations.
By avoiding sorting, it achieves better performance while maintaining clarity and correctness.
