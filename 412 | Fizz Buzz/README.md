📍 Fizz Buzz (LeetCode 412)

🧠 Problem Statement

Given an integer n, return a string array answer where:

For multiples of 3, store "Fizz".
For multiples of 5, store "Buzz".
For multiples of both 3 and 5, store "FizzBuzz".
Otherwise, store the number itself as a string.

Return the resulting list of strings.

⚙️ Approach Used: Conditional Mapping

This solution iterates through every number from 1 to n and determines what value should be added to the result list based on divisibility rules.

A nested ternary expression is used to map each number directly to its corresponding output.

🔄 Step-by-Step Logic

Create Result List
Initialize an ArrayList<String> to store the answers.
Traverse Numbers
Iterate from 1 to n.
Apply Divisibility Rules

For each number:

If divisible by both 3 and 5 → add "FizzBuzz"
Else if divisible by 3 → add "Fizz"
Else if divisible by 5 → add "Buzz"
Otherwise → convert the number to a string and add it to the list
Return Result
After processing all numbers, return the completed list.

✅ Why This Works

Every number belongs to exactly one of four categories:

1️⃣ Divisible by both 3 and 5

2️⃣ Divisible only by 3

3️⃣ Divisible only by 5

4️⃣ Not divisible by either

Checking these conditions in order guarantees the correct output for every number.

🎯 Key Concepts Used

Arrays / Lists
Modulo Operator
Conditional Logic
String Conversion
Iteration

⏱️ Complexity Analysis

Time Complexity: O(n)

Each number from 1 to n is processed exactly once.

Space Complexity: O(n)

The output list stores n strings.
