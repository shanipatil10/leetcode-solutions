README.md — LeetCode 20: Valid Parentheses

The goal is to verify whether a given string of brackets is properly balanced and ordered.
Only three types of brackets are involved: round, curly, and square.

Core Idea
The problem depends on order and nesting, not just counting.
Every closing bracket must match the most recently opened bracket.
This behavior follows the Last-In-First-Out principle.

Approach Used
Traverse the string character by character.
Opening brackets are remembered for later matching.
On encountering a closing bracket, the most recent opening one is checked.
Any mismatch immediately marks the string invalid.
After traversal, no unmatched opening brackets should remain.

Why This Works
Correctly handles nested brackets like {[()]}.
Detects wrong order cases such as ([)].
Fails fast when a closing bracket appears without a matching opening one.
Edge Cases Covered
Empty string is considered valid.
Single opening or closing bracket is invalid.
Early closing brackets are detected immediately.
Extra opening brackets at the end are handled correctly.

Complexity
Time complexity is linear since each character is processed once.
Space complexity is linear in the worst case.
