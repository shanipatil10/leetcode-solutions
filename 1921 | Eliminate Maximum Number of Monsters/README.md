🚀 Eliminate Maximum Number of Monsters

📘 Problem Overview

This project contains an optimized Java solution for the LeetCode problem focused on eliminating the maximum number of monsters before any of them reach the city. Each monster starts at a specific distance and moves toward the city at a fixed speed. The objective is to determine the maximum number of monsters that can be eliminated under the given constraints.

The implemented approach improves significantly over the initial brute force attempt by reducing the overall time complexity and using a mathematically driven strategy.

🧠 Algorithmic Strategy

The solution computes the exact arrival time of every monster by dividing its distance by its speed. These arrival times are stored in a separate array and sorted in ascending order.

After sorting, the algorithm iterates through the arrival times while simulating the elimination process minute by minute. At every minute, exactly one monster can be eliminated. If any monster reaches the city before or at the current elimination minute, the process stops immediately.

This strategy ensures that monsters arriving earlier are always prioritized first, which leads to the maximum possible eliminations.

The approach avoids unnecessary simulation and nested iteration, making it substantially more efficient than the earlier quadratic time attempt.

📊 Complexity Analysis

⏱️ Time Complexity

O(N log N)

The sorting operation dominates the execution time.

💾 Space Complexity

O(N)

An additional array is used to store the calculated arrival times.

⚡ Optimization Insight

The initial brute force strategy relied on repeatedly updating monster distances for every iteration, resulting in quadratic complexity. While logically correct, that approach becomes inefficient for large input sizes.

The optimized solution transforms the problem into a scheduling based approach by focusing only on arrival times rather than continuous movement simulation. This reduces unnecessary computations and produces a scalable solution suitable for competitive programming environments.
