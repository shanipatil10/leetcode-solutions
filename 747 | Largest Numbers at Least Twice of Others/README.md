Largest Number At Least Twice of Others:

This problem requires checking whether the largest number in an integer array is dominant. 
A number is considered dominant if it is at least twice as large as every other number in the array.
The solution starts by scanning the array to find the maximum value and remembering its index. 
This step ensures that the largest element is correctly identified.

After finding the largest element, the array is traversed again to verify the dominance condition.
During this step, the largest element itself is ignored, and all remaining elements are checked.

If the largest element is found to be less than twice any other element, the dominance condition fails and the result is set to -1.
If the largest element successfully satisfies the condition for all other elements, its index is returned as the final answer.
This approach handles all important edge cases, including arrays with a single element, arrays containing zero values, and arrays where no dominant element exists.

The time complexity of the solution is linear ⏱️ because the array is traversed a constant number of times relative to its size.
The space complexity is constant 💾 since no additional data structures are used.

Overall, this solution is efficient, easy to understand, and well suited for technical interviews and competitive programming platforms such as LeetCode.
