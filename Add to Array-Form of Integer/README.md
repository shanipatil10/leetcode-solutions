# Add to Array-Form of Integer (Java)

## Problem
Given an integer array `num` representing a non-negative integer and an integer `k`, add `k` to the number represented by `num` and return the result as an array of digits.

## Approach
- Start adding digits from the end of the array (least significant digit).
- Add the corresponding digit of `k` along with a `carry`.
- Continue until all digits of `num` and `k` are processed.
- Handle any remaining carry.
- Reverse the result list to obtain the final number.

## Algorithm
1. Initialize an empty list to store the result.
2. Traverse the array from the last index and extract digits of `k` using modulo.
3. Add digits along with carry.
4. Store the last digit of the sum and update carry.
5. Repeat until both `num` and `k` are exhausted.
6. Add remaining carry if present.
7. Reverse the list and return it.

## Time Complexity
**O(max(n, log₁₀(k)))**  
Where `n` is the length of the array `num`.

## Space Complexity
**O(max(n, log₁₀(k)))**  
Space is used to store the output result.

## Notes
- All test cases passed successfully.
- Solved in approximately **30 minutes**.
- No external help (AI tools or YouTube) was used.
- Solution is optimal and handles all edge cases.
