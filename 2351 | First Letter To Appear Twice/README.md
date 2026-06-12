📍 First Letter to Appear Twice (LeetCode 2351)

🧠 Problem Statement

Given a string s consisting of lowercase English letters, return the first character that appears twice.

A character is considered repeated when its second occurrence is encountered while traversing the string from left to right.

Return the first such character.

⚙️ Approach Used: Frequency Array

This solution uses a fixed-size frequency array of length 26 to keep track of how many times each lowercase letter has appeared.

As the string is traversed:

The frequency of the current character is increased.
The moment a character's frequency becomes 2, it is returned immediately.

This guarantees finding the first character whose second occurrence appears earliest.

🔄 Step-by-Step Logic

Create Frequency Array
Initialize an integer array of size 26.
Each index represents a lowercase English letter.
Traverse the String
Process characters from left to right.
Update Frequency
Convert the character into its corresponding array index.
Increase its count in the frequency array.
Detect Second Occurrence
After updating the count, check whether the frequency becomes 2.
If yes, return that character immediately.
Return Result
The first character reaching a frequency of 2 is the required answer.

✅ Why This Works

The problem asks for the character whose second occurrence appears first during traversal.

By updating frequencies while scanning the string:

First occurrence → frequency becomes 1
Second occurrence → frequency becomes 2

The moment a frequency reaches 2, we know that character satisfies the condition and can return it immediately.

🎯 Key Concepts Used

Strings
Frequency Array
Character Mapping
Array Counting
Early Termination

⏱️ Complexity Analysis

Time Complexity: O(n)

Each character is visited exactly once.

Space Complexity: O(1)

The frequency array size is fixed at 26.
