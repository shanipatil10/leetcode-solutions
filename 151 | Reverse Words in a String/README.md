Reverse Words in a String (Java)

Problem
• Given a string containing words separated by spaces  
• Reverse the order of the words  
• Remove extra spaces  
• Output must contain only one space between words  
• No leading or trailing spaces  

Example  
Input:
"  hello   world  "

Output:
"world hello"

Approach
• Use trim() to remove leading and trailing spaces  
• Split the string using "\\s+" to handle multiple spaces  
• Traverse the array from right to left  
• Use StringBuilder to build the result efficiently  

Why StringBuilder?
• String is immutable in Java  
• Repeated concatenation creates new objects every time  
• Leads to O(n²) time complexity  
• StringBuilder is mutable  
• Provides O(n) time and memory efficiency  

Complexity
• Time Complexity: O(n)  
• Space Complexity: O(n)  

Key Points
• Always use "\\s+" when splitting words  
• trim() avoids empty elements  
• Prefer StringBuilder over String in loops  
• Cleaner logic = fewer bugs  
