📦⚒️  LAST STONE WEIGHT  ⚒️📦

🪨🪨 You are given an array of stones,  
each stone has a certain **weight**.

Every round:
👉 Pick the **two heaviest stones**  
👉 Smash them together 💥  

Rules:
- If both stones are equal ⚖️ → both vanish ❌
- If not equal → new stone = (heavier − lighter)

🧠 APPROACH 1: MAX HEAP (Priority Queue)

📌 Idea:
- We always need the **largest two stones**
- A **Max Heap** gives fastest access

📌 Steps:
1️⃣ Put all stones into a Max Heap  
2️⃣ While heap size > 1  
   - Remove top two stones  
   - If unequal → insert the difference  
3️⃣ Return remaining stone or 0
