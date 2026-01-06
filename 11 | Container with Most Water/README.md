📘 Container With Most Water – README

🧩 Problem Overview
The task is to find two vertical lines from the given array such that, together with the x-axis, they form a container that holds the maximum amount of water. The height of each line is given, and the distance between lines represents the width.

💡 Approach Used
The solution uses the two-pointer technique to efficiently calculate the maximum water container.
One pointer starts at the beginning of the array
Another pointer starts at the end of the array
At each step, the area is calculated using the smaller height and the distance between pointers
The pointer pointing to the smaller height is moved inward
This ensures that only meaningful comparisons are made.

🔍 Key Insight
The area of water depends on:
The minimum of the two heights
The distance between them
Since the width always decreases when moving pointers inward, the only way to potentially increase area is by increasing the smaller height. Therefore, the pointer with the smaller height is moved.

⏱️ Time Complexity
O(n)
Each element is visited at most once.

🧠 Space Complexity
O(1)
No extra space is used apart from variables.

✅ Why This Solution Is Optimal
Avoids checking all possible pairs
Eliminates unnecessary calculations
Works efficiently even for large inputs
Fully accepted by LeetCode constraints

🎯 Conclusion
This optimized two-pointer approach guarantees the maximum area calculation in linear time by discarding impossible cases early and focusing only on valid container boundaries.
