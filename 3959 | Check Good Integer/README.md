📍 Check Good Integer

🧠 Problem Statement

Given an integer n, determine whether it is a good integer based on the following condition:

Calculate the sum of all digits.
Calculate the sum of the squares of all digits.
The integer is considered good if:

(sum of squared digits) - (sum of digits) ≥ 50

Return:

true if the condition is satisfied.
false otherwise.

⚙️ Approach Used: Digit Extraction & Mathematical Evaluation

This solution processes each digit of the number individually and maintains two running values:

digitSum → sum of all digits
squareSum → sum of squares of all digits

After processing all digits, the required condition is evaluated.

🔄 Step-by-Step Logic

Extract Digits
Repeatedly obtain the last digit using % 10.
Process one digit at a time.
Calculate Digit Sum
Add each extracted digit to digitSum.
Calculate Square Sum
Square the extracted digit.
Add the result to squareSum.
Remove Processed Digit
Divide the number by 10.
Continue until all digits have been processed.
Check Condition

Compute:

squareSum - digitSum

If the result is at least 50, return true.
Otherwise, return false.

✅ Why This Works

Every digit contributes to both:

The overall digit sum.
The sum of squared digits.

By processing each digit exactly once, the algorithm accurately computes both values and directly verifies the required condition.

🎯 Key Concepts Used

Digit Manipulation
Modulo Arithmetic
Integer Division
Mathematical Computation
Conditional Evaluation

⏱️ Complexity Analysis

Time Complexity: O(d)

d is the number of digits in the integer.
Each digit is processed exactly once.

Space Complexity: O(1)

Only a few variables are used.
