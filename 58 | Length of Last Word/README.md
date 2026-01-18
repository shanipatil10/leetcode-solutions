Length of Last Word – Java Solution

📌 Problem Description
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is defined as a maximal substring consisting of non-space characters only.

🧠 Approach
Traverse the string from the end.
Ignore trailing spaces.
Count characters until a space is found after counting has started.
Return the count.
This avoids unnecessary string splitting and extra memory usage.

⚙️ Algorithm
Initialize a counter to 0.
Start iterating from the last character of the string.
Skip spaces until the first non-space character is found.
Increment the counter for each character of the last word.
Stop when a space is encountered after counting starts.
Return the counter.

⏱️ Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1)
Optimal solution since the string must be scanned at least once.


Uses no extra data structures.

Efficient and interview-friendly.
