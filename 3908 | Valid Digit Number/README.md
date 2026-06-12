📍 Valid Digit Number (LeetCode 3908)

🧠 Problem Statement

You are given:

An integer n
A digit x

A number is considered valid if:

✔️ It contains at least one occurrence of digit x.

✔️ It does not start with digit x.

Return true if the number is valid; otherwise, return false.

⚙️ Approach Used: Digit Extraction & Leading Digit Verification

This solution processes the number digit by digit while keeping track of whether the target digit appears anywhere except as the leading digit.

The idea is:

Traverse digits from right to left.
Count occurrences of the target digit.
Preserve the leading digit for the final validity check.

🔄 Step-by-Step Logic

Check Edge Case
Handle the special scenario when both n and x are zero according to the implemented logic.
Scan Digits
Extract the last digit using modulo (% 10).
Compare it with the target digit.
Increase the count whenever a match is found.
Remove Processed Digit
Divide the number by 10.
Continue until only the leading digit remains.
Verify Leading Digit
Check whether the first digit of the number equals the target digit.
If it does, the number is invalid.
Return Result
Return true only if:
The target digit appears at least once.
The number does not start with that digit.

✅ Why This Works

A valid number must satisfy two independent conditions:

1️⃣ The digit must exist somewhere in the number.

2️⃣ The leading digit must be different from the target digit.

By tracking occurrences during digit extraction and checking the leading digit at the end, both requirements are verified efficiently.

🎯 Key Concepts Used

Digit Manipulation
Modulo Arithmetic
Integer Division
Number Traversal
Conditional Validation

⏱️ Complexity Analysis

Time Complexity: O(log n)

Each digit of the number is processed once.

Space Complexity: O(1)

Only a few variables are used regardless of input size.
