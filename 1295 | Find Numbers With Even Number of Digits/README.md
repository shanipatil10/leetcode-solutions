# Find Numbers with Even Number of Digits

## 📝 Problem Description

Given an array `nums` of integers, return how many of them contain an **even number of digits**

## 🚀 Solution Approach

The solution iterates through each number in the array and counts its digits by repeatedly dividing the number by 10 until it reaches 0. 

1. **Loop through the array:** Examine each integer one by one.
2. **Count digits:** Use a `while` loop to divide the number by 10 dynamically, incrementing a digit counter (`count`) on each iteration.
3. **Check for Evenness:** After counting the digits of a number, check if `count % 2 == 0`. If true, increment the main result tracker (`numcount`).
4. **Reset:** Reset the digit counter to `0` before moving to the next number.

### Complexity Analysis
* **Time Complexity:** $O(N \times D)$, where $N$ is the number of elements in the array and $D$ is the average number of digits in the integers. Since the numbers are limited by standard integer bounds, $D$ is at most 10, making the time complexity practically **$O(N)$**.
* **Space Complexity:** **$O(1)$** as the algorithm uses a constant amount of extra space.
