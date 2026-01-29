🧱 Implement Stack Using Queues (LeetCode 225)
📌 Problem Overview
🔁 Implement a Stack (LIFO) using Queue (FIFO) operations only
🧠 Allowed operations: push, pop, top, empty
❌ No direct stack usage allowed
🧠 Approach Used: Two Queues
📦 Main Queue → stores elements in stack order
🔄 Extra Queue → temporary helper during push operation
➕ Push Operation
🔁 Move all elements from Main Queue to Extra Queue
⬆️ Insert the new element into Main Queue
🔙 Move all elements back from Extra Queue to Main Queue
✅ Ensures last inserted element stays at the front (LIFO)
➖ Pop Operation
🚪 Remove the front element from Main Queue
🧹 This element represents the top of the stack
👀 Top Operation
🔍 Peek the front element of Main Queue
📌 Returns the current top of the stack
❓ Empty Check
📭 Check if Main Queue is empty
✔️ Returns true if empty, otherwise false

⏱ Time Complexity
➕ Push → O(n)
➖ Pop → O(1)
👀 Top → O(1)
❓ Empty → O(1)

💾 Space Complexity
🧮 O(n) (due to queue storage)
