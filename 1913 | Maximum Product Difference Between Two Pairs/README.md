📍 Maximum Product Difference Between Two Pairs (LeetCode 1913)

🧠 Problem Statement

Given an integer array nums, choose four distinct indices w, x, y, and z such that:

The product of the first pair is maximized.
The product of the second pair is minimized.

Return the difference between these two products.

The goal is to maximize:

(largest pair product) - (smallest pair product)

⚙️ Approach Used: Two-Pointer Traversal

This solution uses a two-pointer strategy to identify:

The maximum product obtainable from a pair of elements.
The minimum product obtainable from a pair of elements.

Two pointers are maintained:

start → beginning of the array
end → end of the array

The traversal is performed twice:

1️⃣ First pass to determine the maximum pair product.

2️⃣ Second pass to determine the minimum pair product.

🔄 Step-by-Step Logic

Finding Maximum Product
Initialize start and end.
Calculate the product of elements at both pointers.
Update the maximum product whenever a larger value is found.
Move the pointer based on element comparison to explore potentially larger products.
Finding Minimum Product
Reset both pointers.
Again calculate pair products.
Update the minimum product whenever a smaller value is found.
Move pointers according to the opposite comparison condition.
Final Calculation
Compute:

maximum pair product - minimum pair product

Return the resulting value.

✅ Why This Works

The algorithm continuously evaluates pair products from both ends of the array.
It keeps track of the best and worst products encountered during traversal.
By maintaining running maximum and minimum values, the final answer can be computed efficiently.

🎯 Key Concepts Used

Two Pointers
Array Traversal
Greedy Comparison
Product Optimization
Maximum & Minimum Tracking

⏱️ Complexity Analysis

Time Complexity: O(n)

The array is traversed using pointer movements in two passes.

Space Complexity: O(1)

Only a few extra variables are used regardless of input size.
