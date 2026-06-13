# Find All Duplicates in an Array

## 📝 Problem Description

Given an integer array `nums` of length `n` where all the integers of `nums` are in the range `[1, n]` and each integer appears **once** or **twice**, return an array of all the integers that appears **twice**.

You must write an algorithm that runs in **$O(n)$** time and uses only **constant extra space** (O(1) space).
## 🚀 Solution Approach (In-Place Marking)

Since the problem constraints demand **$O(n)$ time** and **$O(1)$ extra space**, we cannot use a traditional hash set or sorting. Instead, we use the input array itself as a hash table by leverage the fact that all numbers fall within the range `[1, n]`.

1. **Map Value to Index:** As we iterate through the array, for each element `nums[i]`, we treat its absolute value minus one (`Math.abs(nums[i]) - 1`) as a target index `j`.
2. **Flip to Negative:** We check the value at `nums[j]`. 
   * If it is positive, it means we are seeing the number `j + 1` for the first time. We negate `nums[j]` to mark it as "visited".
   * If `nums[j]` is already negative, it means we have encountered the number `j + 1` before. Thus, `j + 1` is a duplicate, and we add it to our result list.

### Complexity Analysis
* **Time Complexity:** **O(n)** — We iterate through the array exactly once.
* **Space Complexity:** **O(1)** — No extra data structures are used for the computation. The space used by the output list does not count toward extra space complexity.
