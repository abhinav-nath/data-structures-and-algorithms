# Logarithmic Functions

Logarithmic functions (`log`) are the inverses of exponential functions.

In computer science, `log` is `base 2`, because computers use binary numbers.
Everything in a computer is store as 0's and 1's.
This is different from other sciences, where 10 is the most common base.

**Exponential:**

```
2^2 = 2 * 2 = 4

2^3 = 2 * 2 * 2 = 8

2^4 = 2 * 2 * 2 * 2 = 16
```

The question `log(x)` answers is: *how many 2s do we need to multiply to get x?*

`log(8) = 3` we need to multiply three 2s, `2 * 2 * 2` to get 8

`log(16) = 4` we need to multiply four 2s, `2 * 2 * 2 * 2` to get 16

Another way to phrase it is: *how many times can we divide x by 2 until we get to 1?*
`8/2/2/2 = 1` we have to divide 8 by 2 three times to get to 1, so `log(8) = 3`

`16/2/2/2/2 = 1` we have to divide 16 by 2 four times to get to 1, so `log(16) = 4`

## Why is `log` important?

We sometimes want to reduce the problem size by half in computer algorithms. For example,

- in **binary search**, we cut the search range by (about) half each time. The time complexity is `log(n)`.
- in a **full binary tree** with `n` nodes, where each node except the leaves has two children, the tree's height is `log(n)`.
- and many other algorithms like **merge sort**, **heap sort** etc.
