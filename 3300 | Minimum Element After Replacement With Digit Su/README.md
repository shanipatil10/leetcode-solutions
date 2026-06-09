📍 Minimum Element After Digit Sum Transformation

🧠 Problem Statement

Given an integer array nums, transform each element into the sum of its digits and return the minimum value obtained after the transformation.

For every number:

Extract each digit.
Compute the sum of its digits.
Compare it with the current minimum value.

Return the smallest digit sum among all elements in the array.

⚙️ Approach Used: Digit Extraction & Minimum Tracking

This solution processes every element individually and calculates its digit sum.

During traversal:

Each digit is extracted using the modulo operator (% 10).
The number is reduced using integer division (/ 10).
The digit sum is computed and compared with the current minimum.

🔄 Step-by-Step Logic

Calculate Digit Sum
Traverse every element in the array.
Repeatedly extract the last digit.
Add the digit to a running sum.
Remove the last digit from the number.
Track Minimum Value
After computing the digit sum of a number, compare it with the current minimum.
Update the minimum whenever a smaller digit sum is found.
Reset for Next Element
Reset the digit-sum variable before processing the next number.
Return Result
After processing all elements, return the minimum digit sum obtained.

✅ Why This Works

The digit-sum calculation ensures every number is transformed according to the problem requirement.

By maintaining a running minimum throughout the traversal, the algorithm avoids storing transformed values separately and efficiently finds the smallest result.

🎯 Key Concepts Used

Arrays
Digit Manipulation
Modulo Arithmetic
Integer Division
Minimum Tracking

⏱️ Complexity Analysis

Time Complexity: O(n × d)

n = number of elements in the array
d = number of digits in each number

Each digit of every number is processed exactly once.

Space Complexity: O(1)

Only a few extra variables are used
