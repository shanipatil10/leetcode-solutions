🚤 Boats to Save People (LeetCode 881)
🧠 Problem Statement
You are given an array people where each element represents the weight of a person.
Each boat can carry at most two people and has a weight limit limit.
Your task is to find the minimum number of boats required to save everyone.

⚙️ Approach Used: Greedy + Two Pointers
This solution follows a greedy strategy:
Sort the array of people by weight
Use two pointers:
left → lightest person
right → heaviest person
Try to pair the lightest and heaviest person together
If they fit within the limit → one boat
If not → the heaviest person goes alone
Repeat until all people are assigned boats

🔄 Algorithm Steps
Sort the people array
Initialize two pointers (left, right)
While left ≤ right:
If people[left] + people[right] ≤ limit, move left
Always move right
Increment boat count
Return the total number of boats

✅ Why This Works
Pairing the lightest with the heaviest reduces wasted space
Greedy choice ensures minimum number of boats
Each person is used exactly once

⏱️ Complexity Analysis
Time Complexity: O(n log n) (due to sorting)
Space Complexity: O(1) (no extra data structures)
