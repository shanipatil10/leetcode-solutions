Valid Palindrome (O(1) Space) – Java

📌 Problem Description
Given a string s, determine whether it is a palindrome, considering only alphanumeric characters and ignoring cases.
A string is a palindrome if it reads the same forward and backward after removing non-alphanumeric characters.

💡 Approach (Two Pointers)
Use two pointers:
small starting from the beginning
large starting from the end
Skip characters that are not letters or digits
Compare characters in a caae-insensitive manner
Move pointers inward until they cross
This avoids creating any extra string or array.

⚙️ Algorithm
Initialize two pointers at the start and end of the string.
Ignore non-alphanumeric characters from both ends.
Compare lowercase versions of valid characters.
If any mismatch occurs, return false.
If all comparisons succeed, return true.

⏱️ Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1) ✅
(No extra data structures used)
