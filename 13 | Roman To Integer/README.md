🏛️ Roman to Integer

📌 Problem Description
Given a Roman numeral string, convert it into its corresponding integer value.
Roman numerals use subtraction rules where a smaller value placed before a larger value indicates subtraction.

💡 Approach Used
Store Roman numeral characters and their integer values in a map.
Traverse the string from left to right, comparing the current character with the next one.
If the current value is less than the next value, subtract it from the result.
Otherwise, add it to the result.
After the loop, add the value of the last character.
Return the final computed integer.

🔍 Key Insight
Roman numerals like IV, IX, XL, etc., follow the subtraction rule.
Comparing adjacent characters helps decide whether to add or subtract.
The last character is always added because there is no next character to compare.

⏱️ Time Complexity
O(n)
Single pass through the string

🧠 Space Complexity
O(1)
The map contains a fixed number of Roman symbols
