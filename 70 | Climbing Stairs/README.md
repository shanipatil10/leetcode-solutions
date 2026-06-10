📍 Climbing Stairs (LeetCode 70)

🧠 Problem Statement

You are climbing a staircase with n steps.

Each time, you can either:

Climb 1 step
Climb 2 steps

Determine the total number of distinct ways to reach the top of the staircase.

Return the number of possible ways.

⚙️ Approach Used: Iterative Dynamic Programming

This solution observes that the number of ways to reach a particular step depends on the previous two steps.

To reach step n, you can:

Come from step n - 1 by taking 1 step.
Come from step n - 2 by taking 2 steps.

Therefore:

ways(n) = ways(n - 1) + ways(n - 2)

Instead of using recursion, the solution calculates the answer iteratively while storing only the last two results.

🔄 Step-by-Step Logic

Handle Base Cases
If n = 1, there is only one way to reach the top.
If n = 2, there are two possible ways.
Track Previous Results

Maintain:

a → number of ways for step 1
b → number of ways for step 2
Build the Answer Iteratively

For every step from 3 to n:

Calculate current ways using the sum of previous two values.
Shift the variables forward.
Continue until the nth step is reached.
Return Result
The final computed value represents the total number of distinct ways to reach the top.

✅ Why This Works

Every valid path to step n must come from either:

Step n - 1
Step n - 2

Since these are the only possibilities, adding their counts gives the total number of ways to reach the current step.

This follows the same pattern as the Fibonacci sequence.

🎯 Key Concepts Used

Dynamic Programming
Fibonacci Pattern
Iterative Computation
State Optimization
Bottom-Up Approach

⏱️ Complexity Analysis

Time Complexity: O(n)

The loop runs once from 3 to n.

Space Complexity: O(1)

Only three variables are maintained regardless of input size.
