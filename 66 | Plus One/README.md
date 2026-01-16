➕ Plus One (Array)

📌 Problem Description
The Plus One problem involves an integer array where each element represents a digit of a non-negative number. The digits are ordered from most significant to least significant. The task is to increment the number by one and return the resulting digits as an array.

🧠 Approach Explanation
The solution starts by checking the last digit of the array. If it is not equal to nine, the problem is straightforward: increment the last digit and return the array immediately.
If the last digit is nine, a carry must be propagated toward the left. The array is traversed backward to handle this carry. Whenever a digit is nine, it is converted to zero. When a digit less than nine is found, it is incremented and the process stops.
If all digits are nine, the carry propagates beyond the most significant digit. In this case, a new array with one extra space is created, and the leading digit is set to one.

🧪 Example Scenarios
For an input like [1, 2, 3], the output becomes [1, 2, 4] since no carry is required.
For [1, 9, 9], the carry propagates through the last two digits, resulting in [2, 0, 0].
For [9, 9, 9], all digits turn into zero and a new leading one is added, producing [1, 0, 0, 0].

⚙️ Complexity Analysis
The algorithm runs in linear time ⏱️ because the array is traversed once in the worst case. It uses constant extra space 💾 except when a new array is required for overflow, which is unavoidable in that scenario.

✅ Key Characteristics
This approach avoids unnecessary array creation in most cases, handles carry propagation correctly, and works reliably for all edge cases including arrays consisting entirely of nines.

🏁 Conclusion
This solution provides an efficient and clean way to solve the Plus One problem while respecting array boundaries and handling numerical carry correctly. It is suitable for coding interviews and competitive programming platforms such as LeetCode.
