Two Sum Solution
This repository contains a simple Java solution for the Two Sum problem. The goal is to find two numbers in a given array that sum up to a specific target value and return their indices.
Problem Description

Given an array of integers nums and an integer target, return the indices of the two numbers such that their sum equals target.
You may assume that each input will have exactly one solution, and you may not use the same element twice.

Solution Approach
The provided solution uses a brute-force approach with nested loops.
The outer loop (i) iterates through each element in the array.
The inner loop (j) iterates through the remaining elements starting from i + 1 to avoid using the same element twice and to check every unique pair.
Inside the inner loop, it checks if the sum of the element at index i and the element at index j equals the target.
If a match is found, it immediately returns a new integer array containing the indices i and j.

Time Complexity
The time complexity of this brute-force solution is O(n²) (O-n-squared) because, in the worst case, every pair of numbers in the array is checked exactly once using the nested loops.
