package com.codecafe.algorithms.recursion;

/*
  sum(n) = n + sum(n-1)

  Formula : n(n+1)/2
 */
public class SumOfNaturalNumbers {

  public int sum(int n) {
    if (n == 0)
      return 0;

    return n + sum(n - 1);
  }

}
