🔢 Minimize Maximum Pair Sum in Array
This solution finds the **minimum possible maximum pair sum** by pairing numbers optimally.

🧠 Problem Summary
Given an integer array `nums` of **even length**, pair the elements such that:

- Each element is used exactly once
- The **maximum pair sum is minimized**

Return that **minimum maximum pair sum**.

---

💡 Optimal Strategy

To minimize the maximum pair sum:

- 🔽 Sort the array
- 🤝 Pair the **smallest** number with the **largest**
- 🔁 Move inward using two pointers
- 📈 Track the maximum pair sum
This greedy approach works because extreme values cancel each other.

⚙️ Algorithm
- 📌 Sort the array
- 📌 Initialize two pointers:
  - `start` → beginning
  - `end` → end
- 📌 While `start < end`:
  - Calculate pair sum
  - Update maximum pair sum
  - Move both pointers
    
⏱️ Complexity Analysis
- ⏱️ **Time Complexity:** `O(n log n)`
- 📦 **Space Complexity:** `O(1)` 
