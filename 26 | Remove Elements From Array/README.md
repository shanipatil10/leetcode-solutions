Remove Duplicates from Sorted Array (LeetCode 26)
📌 Problem Statement

Given a sorted integer array nums, remove the duplicates in-place such that each unique element appears only once.
Return the number of unique elements k.
The first k elements of nums should contain the unique values in the same order.

🧠 Approach (Two Pointer Technique)
Since the array is already sorted, all duplicate elements will be adjacent.
Use one pointer (start) to iterate through the array.
Use another pointer (k) to track the position where the next unique element should be placed.
Compare the current element with the previous one.
If they are different, copy the current element to index k and increment k.

💡 Algorithm Steps
Initialize start = 1 (to compare with previous element).
Initialize k = 1 to store the position of the next unique element.
Traverse the array using a while loop.
If nums[start] != nums[start - 1], copy the element to nums[k].
Increment k and continue traversal.
Return k as the count of unique elements.

⏱️ Complexity Analysis
Time Complexity: O(n)
Space Complexity: O(1) (in-place, no extra space used)

🎯 Key Takeaways
Sorted arrays allow efficient two-pointer solutions.
In-place modification avoids extra memory usage.
This approach satisfies all LeetCode constraints.
