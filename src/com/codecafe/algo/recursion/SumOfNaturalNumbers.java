package com.codecafe.algo.recursion;

/*
  sum(n) = n + sum(n-1)

  Formula : n(n+1)/2
 */
public class SumOfNaturalNumbers {

  public static void main(String[] args) {
    int n = 10;
    System.out.println("Sum(" + n + ") = " + sum(n));
  }

  private static int sum(int n) {
    if (n == 0)
      return 0;

    return n + sum(n - 1);
  }

}