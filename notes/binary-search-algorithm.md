# Binary Search Algorithm

Binary Search is applied on the sorted array or list of large size.
It's time complexity of `O(log n)` makes it very fast as compared to other searching algorithms.
The only limitation is that the array or list of elements must be sorted for the binary search algorithm to work on it.

Here are the steps:

1. Start with the middle element:
   - If the **target** value is equal to the middle element of the array, then return the index of the middle element.
   - If not, then compare the middle element with the target value:
     - If the `target value > number in the middle index` then pick the elements to the right of the middle index, and start with `Step 1`.
     - If the `target value < number in the middle index`, then pick the elements to the left of the middle index, and start with `Step 1`.
2. When a match is found, return the index of the element matched.
3. If no match is found, then return `-1`.

**Why is the time complexity of binary search `O(log n)` and how can we calculate the number of steps required to search an element from a given array without doing any calculations?**

When we say the time complexity is `log n`, we actually mean `log₂ n`, although the **base** of the log doesn't matter in asymptotic notations, but still to understand this better, we generally consider a base of 2.

Let's first understand what `log₂(n)` means:

Before proceeding, know that `logₙ(nᵐ) = mlogₙ(n) = m x 1 = m`

```
Expression: log₂(n)
- - - - - - - - - - - - - - -
For n = 2:
log₂(2¹) = 1
Output = 1
- - - - - - - - - - - - - - -
For n = 4
log₂(2²) = 2
Output = 2
- - - - - - - - - - - - - - -
For n = 8
log₂(2³) = 3
Output = 3
- - - - - - - - - - - - - - -
For n = 256
log₂(2⁸) = 8
Output = 8
- - - - - - - - - - - - - - -
For n = 2048
log₂(2¹¹) = 11
Output = 11
- - - - - - - - - - - - - - -
```

## Counting the Number of Steps

As we have already seen, that with every **incorrect guess**, binary search cuts down the list of elements into half.
So if we start with 32 elements, after first unsuccessful guess, we will be left with 16 elements.

So consider an array with 8 elements, after the first unsuccessful guess, binary search will cut down the list to half, leaving behind 4 elements,
then 2 elements after the second unsuccessful guess, and finally only 1 element will be left, which will either be the target or not, checking that will involve one more step.
So all in all binary search needs at most 4 guesses to search the target in an array with 8 elements.

If the size of the list had been 16, then after the first unsuccessful guess, we would have been left with 8 elements.
And after that, as we know, we need at most 4 guesses, add 1 guess to cut down the list from 16 to 8, that brings us to 5 guesses.

So we can say, _as the number of elements are getting doubled, the number of guesses required to find the target increments by 1_.

> Generalizing this, we can say, for an array with `n` elements:
> 
> the number of times we can repeatedly halve, starting at `n`, until we get the value 1, plus one.

And guess what, in mathematics, the function `log₂ n` means exactly the same.

We have already seen how the `log` function works above, did you notice something there?

For `n = 8`, the output of `log₂ n` comes out to be 3, which means the array can be halved 3 times maximum, hence the number of steps (at most) to find the target value will be `(3 + 1) = 4`.
