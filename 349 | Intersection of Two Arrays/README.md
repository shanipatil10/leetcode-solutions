📍 Intersection of Two Arrays (LeetCode 349)

🧠 Problem Statement

Given two integer arrays nums1 and nums2, return an array containing their unique intersection.

Each element in the result:

Must appear only once.
Can be returned in any order.

⚙️ Approach Used: HashSet for Unique Lookup

This solution uses two HashSets to efficiently identify common unique elements.

The first HashSet stores all unique elements from the first array.
The second HashSet stores only the elements that are present in both arrays.

Finally, the intersection set is converted into an integer array.

🔄 Step-by-Step Logic

Store Unique Elements
Traverse nums1.
Insert every element into a HashSet.
Duplicate values are automatically ignored.
Find Common Elements
Traverse nums2.
For each element:
Check whether it exists in the first HashSet.
If it does, insert it into another HashSet.

This ensures that each common element appears only once.

Create Result Array
Create an array whose size equals the number of intersecting elements.
Copy Elements
Traverse the second HashSet.
Copy every element into the result array.
Return Result
Return the array containing all unique common elements.

✅ Why This Works

A HashSet stores only unique values and provides nearly constant-time lookup.

Using one set for searching and another for storing the final intersection guarantees:

Fast searching
No duplicate elements in the answer

This avoids unnecessary nested loops and repeated comparisons.

🎯 Key Concepts Used

HashSet
Hashing
Array Traversal
Unique Element Storage
Fast Lookup

⏱️ Complexity Analysis

Time Complexity: O(n + m)

n = size of nums1
m = size of nums2

Each array is traversed exactly once.

Space Complexity: O(n + k)

n for storing elements of the first array.
k for storing the intersection elements.
