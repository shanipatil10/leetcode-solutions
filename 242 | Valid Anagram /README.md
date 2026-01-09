🔤 Valid Anagram
📌 Problem Description
Given two strings s and t, determine whether t is an anagram of s.
An anagram means both strings contain the same characters with the same frequency, but possibly in a different order.

💡 Approach Used
First, compare the lengths of both strings.
If lengths differ, they cannot be anagrams.
Use a HashMap to store the frequency of each character in the first string.
Traverse the second string and decrease the frequency for matching characters.
If a character is missing or its frequency becomes negative, return false.
If all characters match correctly, return true.

🔍 Key Insight
Anagrams require exact frequency matching.
HashMap allows constant-time frequency updates.
Matching and reducing counts ensures both strings are balanced.

⏱️ Time Complexity
O(n)
One pass for building the frequency map
One pass for validating the second string

🧠 Space Complexity
O(n)
HashMap stores character frequencies

✅ Why This Solution Works Well
Efficient for large strings
Simple and readable logic
Early exit when mismatch is found
Commonly accepted interview approach
