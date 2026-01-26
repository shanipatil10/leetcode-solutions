🥇 Kth Largest Element in an Array (LeetCode 215)
📘 Problem Statement
Given an integer array nums and an integer k, return the kth largest element in the array.
⚠️ Note: The kth largest element is not the kth distinct element.
💡 Approach: Min-Heap of Size k
To efficiently find the kth largest element, a min-heap (PriorityQueue) of size k is used.

🔹 Key Idea
Maintain only the top k largest elements seen so far.
The smallest among these k elements (heap root) represents the kth largest element.

🧠 How the Algorithm Works
Iterate through all elements in the array.
Add elements to the heap until its size reaches k.
For remaining element
If the current element is larger than the heap’s minimum,
remove the minimum add insert the current element.
After processing all elements, the heap’s top element is the answer.

🎯 This ensures the heap never grows beyond size k.
⏱️ Complexity Analysis
Time Complexity: O(n log k)
The array is traversed once (n)
Heap operations take log k time
Space Complexity: O(k)
Heap stores only k elements

✅ Why This Approach Is Good
🚀 Faster than sorting (O(n log n))
💾 Uses limited extra space
💼 Interview-accepted and practical
🔥 Works well when k is small compared to n
