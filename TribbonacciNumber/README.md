Problem Statement

The Tribonacci sequence is a generalization of the Fibonacci sequence where each term is the sum of the three preceding terms:

T0 = 0, T1 = 1, T2 = 1
Tn = Tn-1 + Tn-2 + Tn-3  for n >= 3

Approach

Base cases: Return 0 if n=0, 1 if n=1 or n=2.

Iterative calculation:

Initialize the first three terms: 0, 1, 1.

Loop from 3 to n and update terms:
nextTerm = first + second + third.

Shift the terms for the next iteration.

Return the n-th Tribonacci number after the loop.

Complexity

Time Complexity: O(n) — one loop up to n.

Space Complexity: O(1) — only 3 integer variables used.
