LeetCode 121: Best Time to Buy and Sell Stock

Problem Statement

Given an array prices where:

- prices[i] represents the price of a given stock on the ith day.

You want to maximize your profit by choosing:

- One day to buy the stock
- A different future day to sell the stock

Return the maximum profit you can achieve from this transaction.

If no profit can be achieved, return 0.

Intuition & Approach

I implemented an optimized single-pass greedy approach to solve this problem efficiently.

Minimum Price Tracking:

Continuously track the minimum stock price encountered so far.

Profit Calculation:

For each day, calculate the potential profit by subtracting the minimum price from the current stock price.

Dynamic Profit Update:

Update the maximum profit whenever a better profit is found.

Key Observation:

The best selling day always depends on the minimum buying price seen before it.

Complexity Analysis

Time Complexity:

O(n)
We iterate through the array exactly once.

Space Complexity:

O(1)
No extra data structures are used.
