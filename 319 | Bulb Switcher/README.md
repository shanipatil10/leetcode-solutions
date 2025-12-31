Bulb Switcher 
A concise Java solution for the Bulb Switcher problem on LeetCode.

Problem Description
There are (n) bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.
On the third round, you toggle every third bulb (turning on if it's off or vice-versa). 
For the \(i^{th}\) round, you toggle every (i) bulb. For the n^{th} round, you only toggle the last bulb.
Return the number of bulbs that are on after (n) rounds.

Mathematical Logic 
A bulb at position (i) ends up on only if it is toggled an odd number of times.
A bulb is toggled for every divisor it has.Most numbers have an even number of divisors (pairs).
Only perfect squares have an odd number of divisors (e.g., divisors of 9 are 1, 3, 9).
Therefore, the problem reduces to counting how many perfect squares are less than or equal to (n).
This is equivalent to sqrt{n}.

Complexity 
Time Complexity:O(1) — The calculation of a square root is performed in constant time.
Space Complexity:O(1)— No additional data structures are used.
