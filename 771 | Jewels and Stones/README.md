📍 Jewels and Stones (LeetCode 771)

🧠 Problem Statement

You are given two strings:

jewels → represents the types of stones that are considered jewels.
stones → represents the stones you own.

Each character represents a stone type.

Return the total number of stones that are also jewels.

⚙️ Approach Used: Boolean Lookup Table

This solution uses a boolean array as a lookup table to quickly identify whether a character is a jewel.

Since characters are represented by ASCII values:

Each character can directly map to an index in the boolean array.
Lookup operations become constant time.

The algorithm first marks all jewel characters and then counts how many stones belong to the marked set.

🔄 Step-by-Step Logic

Create Lookup Table
Initialize a boolean array large enough to store ASCII characters.
Mark Jewel Characters
Traverse the jewels string.
For every character:
Mark its corresponding index as true.
Traverse Stones
Iterate through every character in the stones string.
Count Matching Stones
For each stone:
Check its corresponding position in the boolean array.
If it is marked true, increase the counter.
Return Result
Return the total number of stones that are jewels.

✅ Why This Works

The boolean array acts like a fast membership table.

Instead of searching through the jewels string for every stone:

Every lookup takes constant time.
Each stone is checked only once.

This makes the solution both simple and highly efficient.

🎯 Key Concepts Used

Strings
Boolean Array
ASCII Mapping
Lookup Table
Character Processing

⏱️ Complexity Analysis

Time Complexity: O(n + m)

n = length of jewels
m = length of stones

Each string is traversed exactly once.

Space Complexity: O(1)

The boolean array has a fixed size (126) and does not depend on the input size.
