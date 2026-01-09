🍀 Find Lucky Integer in an Array
📌 Problem Description
Given an integer array, a lucky integer is defined as an integer whose value is equal to its frequency in the array.
The task is to return the largest lucky integer present.
If no lucky integer exists, return -1.

💡 Approach Used
The solution uses a HashMap to efficiently count the frequency of each number in the array.
Traverse the array and store the count of each number.
Iterate through the stored frequencies.
Check whether any number is equal to its frequency.
Track the maximum such number.
If no number satisfies the condition, return -1.

🔍 Key Insight
Frequency counting allows constant-time lookups.
Comparing each number with its occurrence helps identify lucky integers.
Using Math.max ensures the largest lucky number is returned.

⏱️ Time Complexity
O(n)
One pass to count frequencies
One pass to evaluate lucky numbers

🧠 Space Complexity
O(n)
HashMap stores frequency of each distinct element.
