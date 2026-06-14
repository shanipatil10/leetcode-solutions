📍 Find the Maximum Achievable Number (LeetCode 2769)

🧠 Problem Statement

In one operation:

Increase or decrease x by 1
Simultaneously decrease or increase num by 1

You may perform this operation at most t times.

Return the maximum achievable value of x.

⚙️ Approach Used: Mathematical Observation

Instead of simulating every operation, this solution derives a direct mathematical formula.

Each operation effectively increases the difference between x and num by 2.

Therefore:

One operation contributes +2
t operations contribute +2 × t

The maximum achievable value can be calculated directly.

🔄 Step-by-Step Logic

Analyze One Operation

During a single operation:

Increase x by 1
Decrease num by 1

This increases the gap between them by:

2

Extend for Multiple Operations

After performing t operations:

Total increase becomes:

2 × t

Compute Final Answer

Add the total increase to the initial value:

num + 2 × t

Return Result
The computed value is the maximum achievable number.

✅ Why This Works

Every operation contributes exactly 2 towards maximizing the target value.

Since the contribution is constant for each operation:

No loops are required.
No simulation is required.

A direct formula produces the answer immediately.

🎯 Key Concepts Used

Mathematics
Observation-Based Optimization
Formula Derivation
Constant Time Computation

⏱️ Complexity Analysis

Time Complexity: O(1)

Only a single arithmetic calculation is performed.

Space Complexity: O(1)

No additional memory is used.
