📍 Contains Duplicate (LeetCode 217)

🧠 Problem Statement

Given an integer array nums, determine whether any value appears at least twice in the array.

Return:

true if any element appears more than once.
false if every element is distinct.

⚙️ Approach Used: HashSet for Fast Lookup

This solution uses a HashSet to keep track of elements that have already been seen.

Since a HashSet only stores unique values:

If an element is already present in the set, a duplicate has been found.
Otherwise, add the element to the set and continue.

🔄 Step-by-Step Logic

Create a HashSet
Initialize an empty HashSet to store visited elements.
Traverse the Array
Iterate through each element in the array.
Check for Duplicates
If the current element already exists in the HashSet:
Return true immediately.
Store Unique Elements
If the element is not present:
Add it to the HashSet.
Return Result
If the entire array is traversed without finding duplicates:
Return false.

✅ Why This Works

A HashSet provides near constant-time lookup operations.

As each element is processed:

First occurrence → stored in the set.
Second occurrence → detected instantly.

This avoids comparing every element with every other element and significantly improves efficiency.

🎯 Key Concepts Used

HashSet
Hashing
Array Traversal
Fast Lookup
Duplicate Detection

⏱️ Complexity Analysis

Time Complexity: O(n)

Each element is visited once.
HashSet insertion and lookup take approximately O(1).

Space Complexity: O(n)

In the worst case, all elements are unique and stored in the HashSet.
