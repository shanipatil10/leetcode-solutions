# MinStack (Java)

An efficient implementation of **MinStack** that supports retrieving the minimum element in **constant time**.

This project demonstrates a classic stack-based data structure problem commonly asked in **coding interviews** and **DSA practice**.

---

## 📌 Problem Overview

Design a stack that supports the following operations:

- Push an element
- Pop an element
- Get the top element
- Retrieve the minimum element

All operations must run in **O(1) time complexity**.

---

## 🧠 Solution Strategy

The solution uses **two stacks**:

- **Main Stack**  
  Stores all pushed elements.

- **Minimum Stack**  
  Stores only the elements that are current minimums.

### How it works:
- When pushing a value:
  - If the stack is empty or the value is smaller than or equal to the current minimum, it is also pushed to the minimum stack.
- When popping a value:
  - If the popped value matches the top of the minimum stack, it is removed from both stacks.

This ensures the minimum element is always accessible in constant time.

---

## ⚙️ Supported Operations

- `push(value)` → Inserts an element into the stack  
- `pop()` → Removes the top element  
- `top()` → Returns the top element  
- `getMin()` → Returns the minimum element in the stack  

---

## ⏱ Time & Space Complexity

| Operation | Time Complexity |
|---------|----------------|
| Push    | O(1)           |
| Pop     | O(1)           |
| Top     | O(1)           |
| GetMin | O(1)           |

**Space Complexity:** O(n)
