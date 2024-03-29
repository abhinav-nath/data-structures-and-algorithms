package com.codecafe.algorithms.recursion;

public class BasicRecursion2 {

  public static void main(String[] args) {
    printNumber(5);
  }

  private static void printNumber(int n) {
    if (n == 0)
      return;

    System.out.print(n + " ");
    printNumber(n - 1);

    System.out.print("#");
  }

}

/*
  Output:
  5 4 3 2 1 #####
*/