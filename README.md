# SlidingWindow Technique

The main idea behind the sliding window technique is to convert two nested loops into a single loop. Usually, the technique helps us to reduce the time complexity from O(n^2) to O(n).

The condition to use the sliding window technique is that the problem asks to find the maximum (or minimum) value for a function that calculates the answer repeatedly for a set of ranges from the array. Namely, if these ranges can be sorted based on their start, and their end becomes sorted as well, then we can use the sliding window technique.

Source from:
- https://www.geeksforgeeks.org/window-sliding-technique/
- https://www.baeldung.com/cs/sliding-window-algorithm#:~:text=The%20condition%20to%20use%20the,of%20ranges%20from%20the%20array.
