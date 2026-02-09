Reverse Words Compression in Place (Java)

Problem
• Given a character array chars
• Compress it in-place using the following rules:
  – Consecutive repeating characters are replaced by the character followed by the count
  – If count is 1, only the character is kept
• Return the new length of the compressed array
• Do not use extra space for another array

Example
Input:
['a','a','b','b','c','c','c']

Output array:
['a','2','b','2','c','3']

Returned length:
6

Approach
• Use two pointers:
  – `i` for reading characters
  – `index` for writing compressed output
• Traverse the array group by group
• Count consecutive identical characters
• Write the character to the array
• If count > 1, write each digit of the count
• Continue until the entire array is processed

Why this approach?
• Works fully in-place
• Uses O(1) extra space
• No StringBuilder or extra arrays
• Matches the exact problem requirement

Complexity
• Time Complexity: O(n)
• Space Complexity: O(1)

Key Points
• Two-pointer technique is essential
• Counts must be written digit by digit
• No copying back is needed
• This is the optimal interview-expected solution
