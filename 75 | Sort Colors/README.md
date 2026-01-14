README — LeetCode 75: Sort Colors

Problem goal is to sort an array containing only 0, 1, and 2 in a single pass without using extra space.
The optimal solution uses the Dutch National Flag approach, which maintains three logical regions in the array: left for 0s, middle for 1s, and right for 2s.

Three pointers are used:
start tracks where the next 0 should be placed,
middle scans the array,
end tracks where the next 2 should be placed.

While scanning, the element at the middle pointer decides the action.
If it is 0, it is swapped toward the start region.
If it is 1, it is already in the correct region.
If it is 2, it is swapped toward the end region.

This guarantees that every element is processed at most once and no sorting library is required.
The algorithm works in linear time because the middle pointer moves forward without revisiting processed elements.

Space usage remains constant since all operations are done in-place.
This approach is reliable for all edge cases such as already sorted arrays, reverse sorted arrays, and arrays with only one unique value.

The key learning is that correct pointer invariants matter more than complex conditions.
This problem is a classic example of how controlled pointer movement can replace traditional sorting.
