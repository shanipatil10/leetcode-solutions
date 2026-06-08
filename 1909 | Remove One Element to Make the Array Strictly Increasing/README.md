📍 Remove One Element to Make the Array Strictly Increasing (LeetCode 1909)

🧠 Problem Statement

Given an integer array nums, determine whether it is possible to make the array strictly increasing by removing exactly one element or no more than one problematic element.

An array is strictly increasing if every element is greater than its previous element.

Return:

true if the array can become strictly increasing after removing at most one element.
false otherwise.

⚙️ Approach Used: Violation Counting & In-Place Adjustment

This solution traverses the array once while tracking violations of the strictly increasing property.

A violation occurs when:

The current element is greater than or equal to the next element.

Instead of actually removing an element, the algorithm simulates the removal by intelligently adjusting values and continuing the traversal.

🔄 Step-by-Step Logic

Detect Violations
Traverse the array from left to right.
Compare each element with its next element.
If the order is strictly increasing, continue.
Count Problematic Positions
Whenever a violation is found, increase the violation counter.
If more than one violation occurs, immediately return false.
Handle Edge Cases
If the violation occurs at the beginning of the array, simply move forward since the first element can be removed.
Simulate Removal

For violations occurring elsewhere:

Check whether removing the current element would maintain the increasing order.
If not, simulate removing the next element by adjusting its value.
Continue traversal without creating additional space.
Final Verification
If at most one violation is encountered, return true.

✅ Why This Works

A strictly increasing array can tolerate only one problematic position.

By counting violations and deciding which element should be virtually removed, the algorithm efficiently determines whether the sequence can be fixed without performing actual deletions.

The moment a second violation appears, it becomes impossible to achieve a strictly increasing sequence with only one removal.

⏱️ Complexity Analysis

Time Complexity: O(n)

The array is traversed only once.

Space Complexity: O(1)

No additional data structures are used.
