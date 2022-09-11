package com.codecafe.algorithms.recursion;

/*
  factorial(n) = n * factorial(n-1)
 */
public class Factorial {

  public int factorial(int n) {
    if (n == 1)
      return 1;

    return n * factorial(n - 1);
  }

}
