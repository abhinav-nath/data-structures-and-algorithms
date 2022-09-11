package com.codecafe.algorithms.recursion;

/*
  factorial(n) = n * factorial(n-1)
 */
public class Factorial {

  public static void main(String[] args) {
    int n = 10;
    System.out.println("factorial(" + n + ") = " + factorial(n));
  }

  private static int factorial(int n) {
    if (n == 1)
      return 1;

    return n * factorial(n - 1);
  }

}